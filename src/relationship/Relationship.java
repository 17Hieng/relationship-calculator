package relationship;


import data_structure.Person;

import java.util.LinkedList;
import java.util.Queue;

public class Relationship {
    //https://www.mymcpl.org/sites/default/files/06-0395_ExtendedFamilyChart.pdf

    //1st generation
    public final static String THIRDGREATGRANDPARENT= "3rd Great Grandparent";
    public final static String THIRDGREATGRANDFATHER = "3rd Great Grandfather";
    public final static String THIRDGREATGRANDMOTHER = "3rd Great Grandmother";


    //2nd generation
    public final static String GREATGREATGRANDFATHER = "Great Great Grandfather";
    public final static String GREATGREATGRANDMOTHER = "Great Great Grandmother";
    public final static String GREATGREATGRANDPARENT = "Great Great Grandparent";

    public final static String GREATGREATGRANDUNCLEORAUNT = "Great Great Grand Uncle/Aunt";
    public final static String GREATGREATGRANDUNCLE = "Great Great Grand Uncle";
    public final static String GREATGREATGRANDAUNT = "Great Great Grand Aunt";


    //3rd generation
    public final static String GREATGRANDFATHER = "Great Grandfather";
    public final static String GREATGRANDMOTHER = "Great Grandmother";
    public final static String GREATGRANDPARENT = "Great Grandparent";

    public final static String GREATGRANDUNCLEORAUNT = "Great Grand Uncle/Aunt";
    public final static String GREATGRANDUNCLE = "Great Grand Uncle";
    public final static String GREATGRANDAUNT = "Great Grand Aunt";

    public final static String FIRSTCOUSINTHRICEREMOVED = "1st Cousin Thrice Removed";


    //4th generation
    public final static String GRANDFATHER = "Grandfather";
    public final static String GRANDMOTHER = "Grandmother";
    public final static String GRANDPARENT = "Grandparent";

    public final static String GRANDUNCLEORAUNT = "Great Uncle/Aunt";
    public final static String GREATUNCLE = "Great Uncle";
    public final static String GREATAUNT = "Great Aunt";

    public final static String FIRSTCOUSINTWICEREMOVED = "1st Cousin Twice Removed";

    public final static String SECONDCOUSINTWICEREMOVED = "2nd Cousin Twice Removed";


    //5th generation
    public final static String FATHER = "Father";
    public final static String MOTHER = "Mother";
    public final static String PARENT = "Parent";

    public final static String UNCLEORAUNT = "Uncle/Aunt";
    public final static String UNCLE = "Uncle";
    public final static String AUNT = "Aunt";

    public final static String FIRSTCOUSINONCEREMOVED = "1st Cousin Once Removed";

    public final static String SECONDCOUSINONCEREMOVED = "2nd Cousin Once Removed";

    public final static String THIRDCOUSINONCEREMOVED = "3rd Cousin Once Removed";


    //6th generation
    public final static String ME = "Me";

    public final static String SISTER = "Sister";
    public final static String BROTHER = "Brother";
    public final static String SIBLING = "Sibling";

    public final static String COUSIN = "Cousin";

    public final static String SECONDCOUSIN = "2nd Cousin";

    public final static String THIRDCOUSIN = "3rd Cousin";

    public final static String FORTHCOUSIN = "4th Cousin";


    //7th generation
    public final static String CHILD = "Child";
    public final static String SON = "Son";
    public final static String DAUGHTER = "Daughter";

    public final static String NIECEORNEPHEW = "Niece/Nephew";
    public final static String NIECE = "Niece";
    public final static String NEPHEW = "Nephew";

    public final static String FORTHCOUSINONCEREMOVED = "4th Cousin Once Removed";


    //8th generation
    public final static String GRANDSON = "Grand Son";
    public final static String GRANDDAUGHTER = "Grand Daughter";
    public final static String GRANDCHILD = "Grand Child";

    public final static String GRANDNIECEORNEPHEW = "Grand Niece/Nephew";
    public final static String GRANDNIECE = "Grand Niece";
    public final static String GRANDNEPHEW = "Grand Nephew";

    public final static String THIRDCOUSINTWICEREMOVED = "3rd Cousin Twice Removed";

    public final static String FORTHCOUSINTWICEREMOVED = "4th Cousin Twice Removed";


    //9th generation
    public final static String GREATGRANDSON = "Great Grand Son";
    public final static String GREATGRANDDAUGHTER = "Great Grand Daughter";
    public final static String GREATGRANDCHILD = "Great Grand Child";

    public final static String GREATGRANDNIECEORNEPHEW = "Great Grand Niece/Nephew";
    public final static String GREATGRANDNIECE = "Great Grand Niece";
    public final static String GREATGRANDNEPHEW = "Great Grand Nephew";

    public final static String SECONDCOUSINTHRICEREMOVED = "2nd Cousin Thirce Removed";

    public final static String THIRDCOUSINTHRICEREMOVED = "3rd Cousin Thrice Removed";

    public final static String FORTHCOUSINTHRICEREMOVED = "4th Cousin Thrice Removed";


    //FAMILY TREE
    //1st generation
    private static final Person third_great_grandfather = new Person(THIRDGREATGRANDFATHER);
    private static final Person third_great_grandmother = new Person(THIRDGREATGRANDMOTHER);
    private static final Person third_great_grandparent = new Person(THIRDGREATGRANDPARENT, new Person[]{third_great_grandfather,third_great_grandmother});


    //2nd generation
    private static final Person great_great_grandfather = new Person(GREATGREATGRANDFATHER);
    private static final Person great_great_grandmother = new Person(GREATGREATGRANDMOTHER);
    private static final Person great_great_grandparent = new Person(GREATGREATGRANDPARENT , new Person[]{great_great_grandfather,great_great_grandmother});

    private static final Person great_great_granduncle = new Person(GREATGREATGRANDUNCLE);
    private static final Person great_great_grandaunt = new Person(GREATGREATGRANDAUNT);
    private static final Person great_great_granduncleoraunt = new Person(GREATGREATGRANDUNCLEORAUNT , new Person[]{great_great_granduncle,great_great_grandaunt});


    //3rd generation
    private static final Person great_grandfather = new Person(GREATGRANDFATHER);
    private static final Person great_grandmother = new Person(GREATGRANDMOTHER);
    private static final Person great_grandparent = new Person(GREATGRANDPARENT , new Person[]{great_grandfather,great_grandmother});

    private static final Person great_granduncle = new Person(GREATGRANDUNCLE);
    private static final Person great_grandaunt = new Person(GREATGRANDAUNT);
    private static final Person great_granduncleoraunt = new Person(GREATGRANDUNCLEORAUNT , new Person[]{great_granduncle,great_grandaunt});

    private static final Person first_cousin_thrice_removed = new Person(FIRSTCOUSINTHRICEREMOVED);


    //4th generation
    private static final Person grandfather = new Person(GRANDFATHER);
    private static final Person grandmother = new Person(GRANDMOTHER);
    private static final Person grandparent = new Person(GRANDPARENT , new Person[]{grandfather,grandmother});

    private static final Person granduncle = new Person(GREATUNCLE);
    private static final Person greataunt = new Person(GREATAUNT);
    private static final Person greatuncleoraunt = new Person(GRANDUNCLEORAUNT , new Person[]{granduncle, greataunt});

    private static final Person first_cousin_twice_removed = new Person(FIRSTCOUSINTWICEREMOVED);

    private static final Person second_cousin_twice_removed  = new Person(SECONDCOUSINTWICEREMOVED);


    //5th generation
    private static final Person father = new Person(FATHER);
    private static final Person mother = new Person(MOTHER);
    private static final Person parent = new Person(PARENT , new Person[]{father,mother});

    private static final Person uncle = new Person(UNCLE);
    private static final Person aunt = new Person(AUNT);
    private static final Person uncleoraunt = new Person(UNCLEORAUNT , new Person[]{uncle,aunt});

    private static final Person first_cousin_once_removed = new Person(FIRSTCOUSINONCEREMOVED);

    private static final Person second_cousin_once_removed = new Person(SECONDCOUSINONCEREMOVED);

    private static final Person third_cousin_once_removed = new Person(THIRDCOUSINONCEREMOVED);


    //6th generation
    private static final Person me = new Person(ME);

    private static final Person sister = new Person(SISTER);
    private static final Person brother = new Person(BROTHER);
    private static final Person sibling = new Person(SIBLING , new Person[]{brother , sister});

    private static final Person cousin = new Person(COUSIN);

    private static final Person second_cousin = new Person(SECONDCOUSIN);

    private static final Person third_cousin = new Person(THIRDCOUSIN);

    private static final Person forth_cousin = new Person(FORTHCOUSIN);


    //7th generation
    private static final Person son = new Person(SON);
    private static final Person daughter = new Person(DAUGHTER);
    private static final Person child = new Person(CHILD , new Person[]{son , daughter});

    private static final Person niece = new Person(NIECE);
    private static final Person nephew = new Person(NEPHEW);
    private static final Person nieceornephew = new Person(NIECEORNEPHEW , new Person[]{niece , nephew});

    private static final Person first_cousin_once_removed_y = new Person(FIRSTCOUSINONCEREMOVED);

    private static final Person second_cousin_once_removed_y = new Person(SECONDCOUSINONCEREMOVED);

    private static final Person third_cousin_once_removed_y = new Person(THIRDCOUSINONCEREMOVED);

    private static final Person forth_cousin_once_removed_y = new Person(FORTHCOUSINONCEREMOVED);


    //8th generation
    private static final Person grandson = new Person(GRANDSON);
    private static final Person granddaughter = new Person(GRANDDAUGHTER);
    private static final Person grandchild = new Person(GRANDCHILD , new Person[] {grandson , granddaughter});

    private static final Person grandniece = new Person(GRANDNIECE);
    private static final Person grandnephew = new Person(GRANDNEPHEW);
    private static final Person grandnieceornephew = new Person(GRANDNIECEORNEPHEW , new Person[] {grandniece , grandnephew});

    private static final Person first_cousin_twice_removed_y = new Person(FIRSTCOUSINTWICEREMOVED);

    private static final Person second_cousin_twice_removed_y = new Person(SECONDCOUSINTWICEREMOVED);

    private static final Person third_cousin_twice_removed_y = new Person(THIRDCOUSINTWICEREMOVED);

    private static final Person forth_cousin_twice_removed_y = new Person(FORTHCOUSINTWICEREMOVED);


    //9th generation
    private static final Person great_grandson = new Person(GREATGRANDSON);
    private static final Person great_granddaughter = new Person(GREATGRANDDAUGHTER);
    private static final Person great_grandchild = new Person(GREATGRANDCHILD , new Person[] {great_grandson , great_granddaughter});

    private static final Person great_grandniece = new Person(GREATGRANDNIECE);
    private static final Person great_grandnephew = new Person(GREATGRANDNEPHEW);
    private static final Person great_grandnieceornephew = new Person(GREATGRANDNIECEORNEPHEW , new Person[] {great_grandniece , great_grandnephew});

    private static final Person first_cousin_thrice_removed_y = new Person(FIRSTCOUSINTHRICEREMOVED);

    private static final Person second_cousin_thrice_removed_y = new Person(SECONDCOUSINTHRICEREMOVED);

    private static final Person third_cousin_thrice_removed_y = new Person(THIRDCOUSINTHRICEREMOVED);

    private static final Person forth_cousin_thrice_removed_y = new Person(FORTHCOUSINTHRICEREMOVED);


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
            case THIRDGREATGRANDFATHER, THIRDGREATGRANDMOTHER , THIRDGREATGRANDPARENT -> p = third_great_grandparent;

            //generation 2
            case GREATGREATGRANDFATHER, GREATGREATGRANDMOTHER, GREATGREATGRANDPARENT -> p = great_great_grandparent;
            case GREATGREATGRANDUNCLE, GREATGREATGRANDAUNT, GREATGREATGRANDUNCLEORAUNT ->
                    p = great_great_granduncleoraunt;

            //generation 3
            case GREATGRANDFATHER, GREATGRANDMOTHER, GREATGRANDPARENT -> p = great_grandparent;
            case GREATGRANDUNCLEORAUNT, GREATGRANDUNCLE, GREATGRANDAUNT -> p = great_granduncleoraunt;
            case FIRSTCOUSINTHRICEREMOVED -> p = first_cousin_thrice_removed;

            //generation 4
            case GRANDFATHER, GRANDMOTHER, GRANDPARENT -> p = grandparent;
            case GRANDUNCLEORAUNT, GREATUNCLE, GREATAUNT -> p = greatuncleoraunt;
            case FIRSTCOUSINTWICEREMOVED -> p = first_cousin_twice_removed;
            case SECONDCOUSINTWICEREMOVED -> p = second_cousin_twice_removed;

            //generation 5
            case FATHER, MOTHER, PARENT -> p = parent;
            case UNCLEORAUNT, UNCLE, AUNT -> p = uncleoraunt;
            case FIRSTCOUSINONCEREMOVED -> p = first_cousin_once_removed;
            case SECONDCOUSINONCEREMOVED -> p = second_cousin_once_removed;
            case THIRDCOUSINONCEREMOVED -> p = third_cousin_once_removed;

            //generation 6
            case ME -> p = me;
            case SISTER, BROTHER, SIBLING -> p = sibling;
            case COUSIN -> p = cousin;
            case SECONDCOUSIN -> p = second_cousin;
            case THIRDCOUSIN -> p = third_cousin;
            case FORTHCOUSIN -> p = forth_cousin;

            //generation 7
            case CHILD, SON, DAUGHTER -> p = child;
            case NIECEORNEPHEW, NIECE, NEPHEW -> p = nieceornephew;
            case FORTHCOUSINONCEREMOVED -> p = forth_cousin_once_removed_y;

            //generation 8
            case GRANDSON, GRANDDAUGHTER, GRANDCHILD -> p = grandchild;
            case GRANDNIECEORNEPHEW, GRANDNIECE, GRANDNEPHEW -> p = grandnieceornephew;
            case THIRDCOUSINTWICEREMOVED -> p = third_cousin_twice_removed_y;
            case FORTHCOUSINTWICEREMOVED -> p = forth_cousin_twice_removed_y;

            //generation 9
            case GREATGRANDSON, GREATGRANDDAUGHTER, GREATGRANDCHILD -> p = great_grandchild;
            case GREATGRANDNIECEORNEPHEW, GREATGRANDNIECE, GREATGRANDNEPHEW -> p = great_grandnieceornephew;
            case SECONDCOUSINTHRICEREMOVED -> p = second_cousin_thrice_removed_y;
            case THIRDCOUSINTHRICEREMOVED -> p = third_cousin_thrice_removed_y;
            case FORTHCOUSINTHRICEREMOVED -> p = forth_cousin_thrice_removed_y;

            default -> {
                throw new IllegalArgumentException("Error - The relationship is not supported.");
            }
        }
        return p;
    }

}
