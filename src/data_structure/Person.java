package data_structure;

public class Person {
    private String addressing;
    private Person parent;
    private Person[] array;
    private Person[] children;

    public Person(String addressing) {
        this.addressing = addressing;
        this.children = new Person[2];
    }
    public Person(String addressing, Person[] array) {
        this.addressing = addressing;
        this.array = new Person[2];

        for (int i = 0; i < array.length && i < this.array.length;i++) {
            this.array[i] = array[i];
        }
        this.children = new Person[2];
    }

    public String getAddressing() {
        return addressing;
    }

    public void addLeftChild(Person child) {
        this.children[0] = (child);
        this.children[0].parent = this;
    }

    public void addRightChild(Person child) {
        this.children[1] = (child);
        this.children[1].parent = this;
    }

    public Person[] getArray(){
        return (this.array != null)? this.array: new Person[]{this,this};
    }

    public Person getParent(){
        return parent;
    }
    public Person getLeft() {
        return children[0];
    }

    public Person getRight() {
        return children[1];
    }

    public boolean isLeaf() {
        return children[0] == null && children[1] == null;
    }

    public Person getSibling(){
        return this.getParent().getRight();
    }
}

