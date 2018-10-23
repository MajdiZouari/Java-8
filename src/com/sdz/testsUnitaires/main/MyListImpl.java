package com.sdz.testsUnitaires.main;

public class MyListImpl<T extends Comparable<T>> implements MyList<T> {

    private Elem start;
    private Elem current;
    private int size;



    public MyListImpl() {
        super();
        start = null;
        current = start;
        size = -1;
    }


    /* (non-Javadoc)
     * @see main.MyListInter#add(T)
     */
    @Override
    public void add(T e) {
        Elem newElem = new Elem(e, null);
        if(start == null) {
            start = newElem;
            current = start;
        } else {
            current.setNext(newElem);
            current = newElem;
        }
        size++;
    }

    /* (non-Javadoc)
     * @see main.MyListInter#removeAt(int)
     */
    @Override
    public T removeAt(int pos) {
        if (pos > size) {
            throw new ArrayIndexOutOfBoundsException("La taille est " + size + "l'element " + pos + "n'existe donc pas");
        }
        Elem previous = start;
        Elem toRemove = previous;
        if(pos == 0) {
            toRemove = start;
            start.setNext(start.getNext());
        } else {
            while(pos-- > 1)
                previous = previous.getNext();
            toRemove = previous.getNext();
            previous.setNext(toRemove.getNext());
        }
        size--;
        return toRemove.getContent();
    }

    /* (non-Javadoc)
     * @see main.MyListInter#removeItem(T)
     */
    @Override
    public T removeItem(T item) {
        Elem previous = null;
        Elem toRemove = start;
        boolean found = false;
        if(start != null && start.getContent().equals(item)) {
            found = true;
            toRemove = start;
            start.setNext(start.getNext());
            size--;
        }
        else {
            while(!found && toRemove != null) {
                previous = toRemove;
                toRemove = toRemove.getNext();
                if(toRemove.getContent().equals(item)) {
                    found = true;
                }
            }
            previous.setNext(toRemove.getNext());
            size--;
        }
        return (toRemove == null) ? null :toRemove.getContent();

    }

    /* (non-Javadoc)
     * @see main.MyListInter#setAt(T, int)
     */
    @Override
    public void setAt(T item, int pos) {
        if(pos > size) {
            throw new ArrayIndexOutOfBoundsException("La taille est " + size + "l'element " + pos + "n'existe donc pas");
        }
        Elem current = start;
        while(pos-- > 0) current = current.getNext();
        current.setContent(item);
    }

    /* (non-Javadoc)
     * @see main.MyListInter#getAt(int)
     */
    @Override
    public T getAt(int pos) {
        if(pos > size) {
            throw new ArrayIndexOutOfBoundsException("La taille est " + size + "l'element " + pos + "n'existe donc pas");
        }
        Elem current = start;
        while(pos-- > 0) current = current.getNext();
        return current.getContent();
    }

    /* (non-Javadoc)
     * @see main.MyListInter#getSize()
     */
    @Override
    public int getSize() {
        return size+1;
    }

    class Elem {
        private T content;
        private Elem next;

        public Elem(T content, Elem next) {
            super();
            this.content = content;
            this.next = next;
        }

        public T getContent() {
            return content;
        }

        public Elem getNext() {
            return next;
        }

        public void setNext(Elem n) {
            next = n;
        }

        public void setContent(T c) {
            content = c;
        }

    }

    /* (non-Javadoc)
     * @see main.MyListInter#reset()
     */
    @Override
    public void reset() {
        size = -1;
        start  = null;
        current = start;
    }

}

