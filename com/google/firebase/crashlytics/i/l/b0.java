package com.google.firebase.crashlytics.i.l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class b0<E> implements List<E>, RandomAccess {

    /* renamed from: e  reason: collision with root package name */
    private final List<E> f1525e;

    private b0(List<E> list) {
        this.f1525e = Collections.unmodifiableList(list);
    }

    public static <E> b0<E> h(List<E> list) {
        return new b0<>(list);
    }

    public static <E> b0<E> i(E... eArr) {
        return new b0<>(Arrays.asList(eArr));
    }

    @Override // java.util.List
    public void add(int i2, E e2) {
        this.f1525e.add(i2, e2);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e2) {
        return this.f1525e.add(e2);
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends E> collection) {
        return this.f1525e.addAll(i2, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.f1525e.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f1525e.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f1525e.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f1525e.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f1525e.equals(obj);
    }

    @Override // java.util.List
    public E get(int i2) {
        return this.f1525e.get(i2);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f1525e.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f1525e.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f1525e.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f1525e.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f1525e.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.f1525e.listIterator();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i2) {
        return this.f1525e.listIterator(i2);
    }

    @Override // java.util.List
    public E remove(int i2) {
        return this.f1525e.remove(i2);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f1525e.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f1525e.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f1525e.retainAll(collection);
    }

    @Override // java.util.List
    public E set(int i2, E e2) {
        return this.f1525e.set(i2, e2);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f1525e.size();
    }

    @Override // java.util.List
    public List<E> subList(int i2, int i3) {
        return this.f1525e.subList(i2, i3);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f1525e.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f1525e.toArray(tArr);
    }
}
