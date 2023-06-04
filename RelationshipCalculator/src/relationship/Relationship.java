package relationship;


import data_structure.Person;

import java.util.LinkedList;
import java.util.Queue;

public class Relationship {
    //https://www.mymcpl.org/sites/default/files/06-0395_ExtendedFamilyChart.pdf

    //Don't let anyone instantiate this class
    private Relationship(){}

    //1st generation
    public final static String THIRD_GREAT_GRAND_PARENT = "3rd Great Grandparent";
    public final static String THIRD_GREAT_GRAND_FATHER = "3rd Great Grandfather";
    public final static String THIRD_GREAT_GRAND_MOTHER = "3rd Great Grandmother";


    //2nd generation
    public final static String GREAT_GREAT_GRAND_FATHER = "Great Great Grandfather";
    public final static String GREAT_GREAT_GRAND_MOTHER = "Great Great Grandmother";
    public final static String GREAT_GREAT_GRAND_PARENT = "Great Great Grandparent";

    public final static String GREAT_GREAT_GRAND_UNCLE_OR_AUNT = "Great Great Grand Uncle/Aunt";
    public final static String GREAT_GREAT_GRAND_UNCLE = "Great Great Grand Uncle";
    public final static String GREAT_GREAT_GRAND_AUNT = "Great Great Grand Aunt";


    //3rd generation
    public final static String GREAT_GRAND_FATHER = "Great Grandfather";
    public final static String GREAT_GRAND_MOTHER = "Great Grandmother";
    public final static String GREAT_GRAND_PARENT = "Great Grandparent";

    public final static String GREAT_GRAND_UNCLE_OR_AUNT = "Great Grand Uncle/Aunt";
    public final static String GREAT_GRAND_UNCLE = "Great Grand Uncle";
    public final static String GREAT_GRAND_AUNT = "Great Grand Aunt";

    public final static String FIRST_COUSIN_THRICE_REMOVED = "1st Cousin Thrice Removed";


    //4th generation
    public final static String GRAND_FATHER = "Grandfather";
    public final static String GRAND_MOTHER = "Grandmother";
    public final static String GRAND_PARENT = "Grandparent";

    public final static String GRAND_UNCLE_OR_AUNT = "Great Uncle/Aunt";
    public final static String GREAT_UNCLE = "Great Uncle";
    public final static String GREAT_AUNT = "Great Aunt";

    public final static String FIRST_COUSIN_TWICE_REMOVED = "1st Cousin Twice Removed";

    public final static String SECOND_COUSIN_TWICE_REMOVED = "2nd Cousin Twice Removed";


    //5th generation
    public final static String FATHER = "Father";
    public final static String MOTHER = "Mother";
    public final static String PARENT = "Parent";

    public final static String UNCLE_OR_AUNT = "Uncle/Aunt";
    public final static String UNCLE = "Uncle";
    public final static String AUNT = "Aunt";

    public final static String FIRST_COUSIN_ONCE_REMOVED = "1st Cousin Once Removed";

    public final static String SECOND_COUSIN_ONCE_REMOVED = "2nd Cousin Once Removed";

    public final static String THIRD_COUSIN_ONCE_REMOVED = "3rd Cousin Once Removed";


    //6th generation
    public final static String ME = "Me";

    public final static String SISTER = "Sister";
    public final static String BROTHER = "Brother";
    public final static String SIBLING = "Sibling";

    public final static String COUSIN = "Cousin";

    public final static String SECOND_COUSIN = "2nd Cousin";

    public final static String THIRD_COUSIN = "3rd Cousin";

    public final static String FORTH_COUSIN = "4th Cousin";


    //7th generation
    public final static String CHILD = "Child";
    public final static String SON = "Son";
    public final static String DAUGHTER = "Daughter";

    public final static String NIECE_OR_NEPHEW = "Niece/Nephew";
    public final static String NIECE = "Niece";
    public final static String NEPHEW = "Nephew";

    public final static String FORTH_COUSIN_ONCE_REMOVED = "4th Cousin Once Removed";


    //8th generation
    public final static String GRAND_SON = "Grand Son";
    public final static String GRAND_DAUGHTER = "Grand Daughter";
    public final static String GRAND_CHILD = "Grand Child";

    public final static String GRAND_NIECE_OR_NEPHEW = "Grand Niece/Nephew";
    public final static String GRAND_NIECE = "Grand Niece";
    public final static String GRAND_NEPHEW = "Grand Nephew";

    public final static String THIRD_COUSIN_TWICE_REMOVED = "3rd Cousin Twice Removed";

    public final static String FORTH_COUSIN_TWICE_REMOVED = "4th Cousin Twice Removed";


    //9th generation
    public final static String GREAT_GRAND_SON = "Great Grand Son";
    public final static String GREAT_GRAND_DAUGHTER = "Great Grand Daughter";
    public final static String GREAT_GRAND_CHILD = "Great Grand Child";

    public final static String GREAT_GRAND_NIECE_OR_NEPHEW = "Great Grand Niece/Nephew";
    public final static String GREAT_GRAND_NIECE = "Great Grand Niece";
    public final static String GREAT_GRAND_NEPHEW = "Great Grand Nephew";

    public final static String SECOND_COUSIN_THRICE_REMOVED = "2nd Cousin Thirce Removed";

    public final static String THIRD_COUSIN_THRICE_REMOVED = "3rd Cousin Thrice Removed";

    public final static String FORTH_COUSIN_THRICE_REMOVED = "4th Cousin Thrice Removed";


    //FAMILY TREE
    //1st generation
    private static final Person third_great_grandfather = new Person(THIRD_GREAT_GRAND_FATHER);
    private static final Person third_great_grandmother = new Person(THIRD_GREAT_GRAND_MOTHER);
    private static final Person third_great_grandparent = new Person(THIRD_GREAT_GRAND_PARENT, new Person[]{third_great_grandfather,third_great_grandmother});


    //2nd generation
    private static final Person great_great_grandfather = new Person(GREAT_GREAT_GRAND_FATHER);
    private static final Person great_great_grandmother = new Person(GREAT_GREAT_GRAND_MOTHER);
    private static final Person great_great_grandparent = new Person(GREAT_GREAT_GRAND_PARENT, new Person[]{great_great_grandfather,great_great_grandmother});

    private static final Person great_great_granduncle = new Person(GREAT_GREAT_GRAND_UNCLE);
    private static final Person great_great_grandaunt = new Person(GREAT_GREAT_GRAND_AUNT);
    private static final Person great_great_granduncleoraunt = new Person(GREAT_GREAT_GRAND_UNCLE_OR_AUNT, new Person[]{great_great_granduncle,great_great_grandaunt});


    //3rd generation
    private static final Person great_grandfather = new Person(GREAT_GRAND_FATHER);
    private static final Person great_grandmother = new Person(GREAT_GRAND_MOTHER);
    private static final Person great_grandparent = new Person(GREAT_GRAND_PARENT, new Person[]{great_grandfather,great_grandmother});

    private static final Person great_granduncle = new Person(GREAT_GRAND_UNCLE);
    private static final Person great_grandaunt = new Person(GREAT_GRAND_AUNT);
    private static final Person great_granduncleoraunt = new Person(GREAT_GRAND_UNCLE_OR_AUNT, new Person[]{great_granduncle,great_grandaunt});

    private static final Person first_cousin_thrice_removed = new Person(FIRST_COUSIN_THRICE_REMOVED);


    //4th generation
    private static final Person grandfather = new Person(GRAND_FATHER);
    private static final Person grandmother = new Person(GRAND_MOTHER);
    private static final Person grandparent = new Person(GRAND_PARENT, new Person[]{grandfather,grandmother});

    private static final Person granduncle = new Person(GREAT_UNCLE);
    private static final Person greataunt = new Person(GREAT_AUNT);
    private static final Person greatuncleoraunt = new Person(GRAND_UNCLE_OR_AUNT, new Person[]{granduncle, greataunt});

    private static final Person first_cousin_twice_removed = new Person(FIRST_COUSIN_TWICE_REMOVED);

    private static final Person second_cousin_twice_removed  = new Person(SECOND_COUSIN_TWICE_REMOVED);


    //5th generation
    private static final Person father = new Person(FATHER);
    private static final Person mother = new Person(MOTHER);
    private static final Person parent = new Person(PARENT , new Person[]{father,mother});

    private static final Person uncle = new Person(UNCLE);
    private static final Person aunt = new Person(AUNT);
    private static final Person uncleoraunt = new Person(UNCLE_OR_AUNT, new Person[]{uncle,aunt});

    private static final Person first_cousin_once_removed = new Person(FIRST_COUSIN_ONCE_REMOVED);

    private static final Person second_cousin_once_removed = new Person(SECOND_COUSIN_ONCE_REMOVED);

    private static final Person third_cousin_once_removed = new Person(THIRD_COUSIN_ONCE_REMOVED);


    //6th generation
    private static final Person me = new Person(ME);

    private static final Person sister = new Person(SISTER);
    private static final Person brother = new Person(BROTHER);
    private static final Person sibling = new Person(SIBLING , new Person[]{brother , sister});

    private static final Person cousin = new Person(COUSIN);

    private static final Person second_cousin = new Person(SECOND_COUSIN);

    private static final Person third_cousin = new Person(THIRD_COUSIN);

    private static final Person forth_cousin = new Person(FORTH_COUSIN);


    //7th generation
    private static final Person son = new Person(SON);
    private static final Person daughter = new Person(DAUGHTER);
    private static final Person child = new Person(CHILD , new Person[]{son , daughter});

    private static final Person niece = new Person(NIECE);
    private static final Person nephew = new Person(NEPHEW);
    private static final Person nieceornephew = new Person(NIECE_OR_NEPHEW, new Person[]{niece , nephew});

    private static final Person first_cousin_once_removed_y = new Person(FIRST_COUSIN_ONCE_REMOVED);

    private static final Person second_cousin_once_removed_y = new Person(SECOND_COUSIN_ONCE_REMOVED);

    private static final Person third_cousin_once_removed_y = new Person(THIRD_COUSIN_ONCE_REMOVED);

    private static final Person forth_cousin_once_removed_y = new Person(FORTH_COUSIN_ONCE_REMOVED);


    //8th generation
    private static final Person grandson = new Person(GRAND_SON);
    private static final Person granddaughter = new Person(GRAND_DAUGHTER);
    private static final Person grandchild = new Person(GRAND_CHILD, new Person[] {grandson , granddaughter});

    private static final Person grandniece = new Person(GRAND_NIECE);
    private static final Person grandnephew = new Person(GRAND_NEPHEW);
    private static final Person grandnieceornephew = new Person(GRAND_NIECE_OR_NEPHEW, new Person[] {grandniece , grandnephew});

    private static final Person first_cousin_twice_removed_y = new Person(FIRST_COUSIN_TWICE_REMOVED);

    private static final Person second_cousin_twice_removed_y = new Person(SECOND_COUSIN_TWICE_REMOVED);

    private static final Person third_cousin_twice_removed_y = new Person(THIRD_COUSIN_TWICE_REMOVED);

    private static final Person forth_cousin_twice_removed_y = new Person(FORTH_COUSIN_TWICE_REMOVED);


    //9th generation
    private static final Person great_grandson = new Person(GREAT_GRAND_SON);
    private static final Person great_granddaughter = new Person(GREAT_GRAND_DAUGHTER);
    private static final Person great_grandchild = new Person(GREAT_GRAND_CHILD, new Person[] {great_grandson , great_granddaughter});

    private static final Person great_grandniece = new Person(GREAT_GRAND_NIECE);
    private static final Person great_grandnephew = new Person(GREAT_GRAND_NEPHEW);
    private static final Person great_grandnieceornephew = new Person(GREAT_GRAND_NIECE_OR_NEPHEW, new Person[] {great_grandniece , great_grandnephew});

    private static final Person first_cousin_thrice_removed_y = new Person(FIRST_COUSIN_THRICE_REMOVED);

    private static final Person second_cousin_thrice_removed_y = new Person(SECOND_COUSIN_THRICE_REMOVED);

    private static final Person third_cousin_thrice_removed_y = new Person(THIRD_COUSIN_THRICE_REMOVED);

    private static final Person forth_cousin_thrice_removed_y = new Person(FORTH_COUSIN_THRICE_REMOVED);


    static {
        //1st generation
        third_great_grandparent.addLeftChild(great_great_grandparent);
        third_great_grandparent.addRightChild(great_great_granduncleoraunt);


        //2nd generation
        great_great_grandparent.addLeftChild(great_grandparent);
        great_great_grandparent.addRightChild(great_granduncleoraunt);

        great_great_granduncleoraunt.addLeftChild(first_cousin_thrice_removed);
        great_great_granduncleoraunt.addRightChild(great_great_granduncleoraunt.getLeft());


        //3rd generation
        great_grandparent.addLeftChild(grandparent);
        great_grandparent.addRightChild(greatuncleoraunt);

        great_granduncleoraunt.addLeftChild(first_cousin_twice_removed);
        great_granduncleoraunt.addRightChild(great_granduncleoraunt.getLeft());

        first_cousin_thrice_removed.addLeftChild(second_cousin_twice_removed);
        first_cousin_thrice_removed.addRightChild(first_cousin_thrice_removed.getLeft());


        //4th generation
        grandparent.addLeftChild(parent);
        grandparent.addRightChild(uncleoraunt);

        greatuncleoraunt.addLeftChild(first_cousin_once_removed);
        greatuncleoraunt.addRightChild(greatuncleoraunt.getLeft());

        first_cousin_twice_removed.addLeftChild(second_cousin_once_removed);
        first_cousin_twice_removed.addRightChild(first_cousin_twice_removed.getLeft());

        second_cousin_twice_removed.addLeftChild(third_cousin_once_removed);
        second_cousin_twice_removed.addRightChild(second_cousin_twice_removed.getLeft());


        //5th generation
        parent.addLeftChild(me);
        parent.addRightChild(sibling);

        uncleoraunt.addLeftChild(cousin);
        uncleoraunt.addRightChild(uncleoraunt.getLeft());

        first_cousin_once_removed.addLeftChild(second_cousin);
        first_cousin_once_removed.addRightChild(first_cousin_once_removed.getLeft());

        second_cousin_once_removed.addLeftChild(third_cousin);
        second_cousin_once_removed.addRightChild(second_cousin_once_removed.getLeft());

        third_cousin_once_removed.addLeftChild(forth_cousin);
        third_cousin_once_removed.addRightChild(third_cousin_once_removed.getLeft());


        //6th generation
        me.addLeftChild(child);
        me.addRightChild(me.getLeft());

        sibling.addLeftChild(nieceornephew);
        sibling.addRightChild(sibling.getLeft());

        cousin.addLeftChild(first_cousin_once_removed_y);
        cousin.addRightChild(cousin.getLeft());

        second_cousin.addLeftChild(second_cousin_once_removed_y);
        second_cousin.addRightChild(second_cousin.getLeft());

        third_cousin.addLeftChild(third_cousin_once_removed_y);
        third_cousin.addRightChild(third_cousin.getLeft());

        forth_cousin.addLeftChild(forth_cousin_once_removed_y);
        forth_cousin.addRightChild(forth_cousin.getLeft());


        //7th generation
        child.addLeftChild(grandchild);
        child.addRightChild(child.getLeft());

        nieceornephew.addLeftChild(grandnieceornephew);
        nieceornephew.addRightChild(nieceornephew.getLeft());

        first_cousin_once_removed_y.addLeftChild(first_cousin_twice_removed_y);
        first_cousin_once_removed_y.addRightChild(first_cousin_once_removed_y.getLeft());

        second_cousin_once_removed_y.addLeftChild(second_cousin_twice_removed_y);
        second_cousin_once_removed_y.addRightChild(second_cousin_once_removed_y.getLeft());

        third_cousin_once_removed_y.addLeftChild(third_cousin_twice_removed_y);
        third_cousin_once_removed_y.addRightChild(third_cousin_once_removed_y.getLeft());

        forth_cousin_once_removed_y.addLeftChild(forth_cousin_twice_removed_y);
        forth_cousin_once_removed_y.addRightChild(forth_cousin_once_removed_y.getLeft());


        //8th generation
        grandchild.addLeftChild(great_grandchild);
        grandchild.addRightChild(grandchild.getLeft());

        grandnieceornephew.addLeftChild(great_grandnieceornephew);
        grandnieceornephew.addRightChild(grandnieceornephew.getLeft());

        first_cousin_twice_removed_y.addLeftChild(first_cousin_thrice_removed_y);
        first_cousin_twice_removed_y.addRightChild(first_cousin_twice_removed_y.getLeft());

        second_cousin_twice_removed_y.addLeftChild(second_cousin_thrice_removed_y);
        second_cousin_twice_removed_y.addRightChild(second_cousin_twice_removed_y.getLeft());

        third_cousin_twice_removed_y.addLeftChild(third_cousin_thrice_removed_y);
        third_cousin_twice_removed_y.addRightChild(third_cousin_twice_removed_y.getLeft());

        forth_cousin_twice_removed_y.addLeftChild(forth_cousin_thrice_removed_y);
        forth_cousin_twice_removed_y.addRightChild(forth_cousin_twice_removed_y.getLeft());

    }



    public static String calculateRelation(
            String person1,
            String person2
    ){
        if (person1.toLowerCase().contains("removed"))
            throw new IllegalArgumentException(
                    "Error - The cousin removed relationship calculation" +
                    " does not supported in calculatedRelation method.");

        Person p1 = findPersonFromTree(person1);

        if(p1 == null) throw new IllegalArgumentException("Error - The relationship is not supported.");

        try {
            switch (person2) {
                case FATHER -> {
                    return p1.getParent().getArray()[0].getAddressing();
                }
                case MOTHER -> {
                    return p1.getParent().getArray()[1].getAddressing();
                }
                case BROTHER -> {
                    return p1.getSibling().getArray()[0].getAddressing();
                }
                case SISTER -> {
                    return p1.getSibling().getArray()[1].getAddressing();
                }
                case SON -> {
                    if (p1 == parent) return p1.getRight().getArray()[0].getAddressing();
                    return p1.getLeft().getArray()[0].getAddressing();
                }
                case DAUGHTER -> {
                    if (p1 == parent) return p1.getRight().getArray()[1].getAddressing();
                    return p1.getLeft().getArray()[1].getAddressing();
                }
                case ME -> {
                    return ME;
                }
            }
        }catch (NullPointerException e) {
            throw new IllegalArgumentException("Error - The relationship is not supported.");
        }
        return null;
    }

    public static String calculateNestedRelation(
            String person1,
            Queue<String> personList
    ){
        if (person1.toLowerCase().contains("removed"))
            throw new IllegalArgumentException(
                    "Error - The cousin removed relationship calculation" +
                            " does not supported in calculatedRelation method.");

        Person p1 = findPersonFromTree(person1);
        String lastPerson = null;

        if(p1 == null)
            throw new IllegalArgumentException("Error - The relationship is not supported.");

        try {
            for (String item:
                 personList) {
                    switch (item) {
                        case FATHER,MOTHER -> p1 = p1.getParent();
                        case BROTHER,SISTER -> p1 = p1.getSibling();
                        case SON,DAUGHTER -> p1 = (p1 == parent)?  p1.getRight() : p1.getLeft();
                        case ME -> p1 = p1;
                        default -> throw new IllegalArgumentException("Error - The relationship is not supported.");
                    }
                    lastPerson = item;
            }
            switch (lastPerson){
                case FATHER,BROTHER,SON -> {
                    return p1.getArray()[0].getAddressing();
                }
                case MOTHER,SISTER,DAUGHTER ->{
                    return p1.getArray()[1].getAddressing();
                }
                default -> {
                    return null;
                }
            }
        }catch (NullPointerException e) {
            throw new IllegalArgumentException("Error - The relationship is not supported.");
        }
    }

    private static Person findPersonFromTree(String person){
        Person p;

        switch (person) {
            //generation 1
            case THIRD_GREAT_GRAND_FATHER, THIRD_GREAT_GRAND_MOTHER, THIRD_GREAT_GRAND_PARENT -> p = third_great_grandparent;

            //generation 2
            case GREAT_GREAT_GRAND_FATHER, GREAT_GREAT_GRAND_MOTHER, GREAT_GREAT_GRAND_PARENT -> p = great_great_grandparent;
            case GREAT_GREAT_GRAND_UNCLE, GREAT_GREAT_GRAND_AUNT, GREAT_GREAT_GRAND_UNCLE_OR_AUNT ->
                    p = great_great_granduncleoraunt;

            //generation 3
            case GREAT_GRAND_FATHER, GREAT_GRAND_MOTHER, GREAT_GRAND_PARENT -> p = great_grandparent;
            case GREAT_GRAND_UNCLE_OR_AUNT, GREAT_GRAND_UNCLE, GREAT_GRAND_AUNT -> p = great_granduncleoraunt;
            case FIRST_COUSIN_THRICE_REMOVED -> p = first_cousin_thrice_removed;

            //generation 4
            case GRAND_FATHER, GRAND_MOTHER, GRAND_PARENT -> p = grandparent;
            case GRAND_UNCLE_OR_AUNT, GREAT_UNCLE, GREAT_AUNT -> p = greatuncleoraunt;
            case FIRST_COUSIN_TWICE_REMOVED -> p = first_cousin_twice_removed;
            case SECOND_COUSIN_TWICE_REMOVED -> p = second_cousin_twice_removed;

            //generation 5
            case FATHER, MOTHER, PARENT -> p = parent;
            case UNCLE_OR_AUNT, UNCLE, AUNT -> p = uncleoraunt;
            case FIRST_COUSIN_ONCE_REMOVED -> p = first_cousin_once_removed;
            case SECOND_COUSIN_ONCE_REMOVED -> p = second_cousin_once_removed;
            case THIRD_COUSIN_ONCE_REMOVED -> p = third_cousin_once_removed;

            //generation 6
            case ME -> p = me;
            case SISTER, BROTHER, SIBLING -> p = sibling;
            case COUSIN -> p = cousin;
            case SECOND_COUSIN -> p = second_cousin;
            case THIRD_COUSIN -> p = third_cousin;
            case FORTH_COUSIN -> p = forth_cousin;

            //generation 7
            case CHILD, SON, DAUGHTER -> p = child;
            case NIECE_OR_NEPHEW, NIECE, NEPHEW -> p = nieceornephew;
            case FORTH_COUSIN_ONCE_REMOVED -> p = forth_cousin_once_removed_y;

            //generation 8
            case GRAND_SON, GRAND_DAUGHTER, GRAND_CHILD -> p = grandchild;
            case GRAND_NIECE_OR_NEPHEW, GRAND_NIECE, GRAND_NEPHEW -> p = grandnieceornephew;
            case THIRD_COUSIN_TWICE_REMOVED -> p = third_cousin_twice_removed_y;
            case FORTH_COUSIN_TWICE_REMOVED -> p = forth_cousin_twice_removed_y;

            //generation 9
            case GREAT_GRAND_SON, GREAT_GRAND_DAUGHTER, GREAT_GRAND_CHILD -> p = great_grandchild;
            case GREAT_GRAND_NIECE_OR_NEPHEW, GREAT_GRAND_NIECE, GREAT_GRAND_NEPHEW -> p = great_grandnieceornephew;
            case SECOND_COUSIN_THRICE_REMOVED -> p = second_cousin_thrice_removed_y;
            case THIRD_COUSIN_THRICE_REMOVED -> p = third_cousin_thrice_removed_y;
            case FORTH_COUSIN_THRICE_REMOVED -> p = forth_cousin_thrice_removed_y;

            default -> {
                throw new IllegalArgumentException("Error - The relationship is not supported.");
            }
        }
        return p;
    }
}
