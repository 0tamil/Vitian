package com.google.firebase.installations;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
/* loaded from: classes.dex */
class f {
    private final FileChannel a;
    private final FileLock b;

    private f(FileChannel fileChannel, FileLock fileLock) {
        this.a = fileChannel;
        this.b = fileLock;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f a(Context context, String str) {
        FileLock fileLock;
        FileChannel fileChannel;
        Throwable e2;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), str), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
                try {
                    return new f(fileChannel, fileLock);
                } catch (IOException e3) {
                    e2 = e3;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e2);
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e4) {
                    e2 = e4;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e2);
                    if (fileLock != null) {
                    }
                    if (fileChannel != null) {
                    }
                    return null;
                } catch (OverlappingFileLockException e5) {
                    e2 = e5;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e2);
                    if (fileLock != null) {
                    }
                    if (fileChannel != null) {
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e6) {
                e2 = e6;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e7) {
            e2 = e7;
            fileChannel = null;
            fileLock = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        try {
            this.b.release();
            this.a.close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }
}
