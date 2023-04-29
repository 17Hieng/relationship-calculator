package relationship;


import data_structure.BinaryTree;

public class Relationship {
    //https://www.mymcpl.org/sites/default/files/06-0395_ExtendedFamilyChart.pdf

    //1st level
    public final static String THIRDGREATGRANDPARENT= "3rd Great Grandparent";
    public final static String THIRDGREATGRANDFATHER = "3rd Great Grandfather";
    public final static String THIRDGREATGRANDMOTHER = "3rd Great Grandmother";


    //2nd level
    public final static String GREATGREATGRANDFATHER = "Great Great Grandfather";
    public final static String GREATGREATGRANDMOTHER = "Great Great Grandmother";
    public final static String GREATGREATGRANDPARENT = "Great Great Grandparent";

    public final static String GREATGREATGRANDUNCLEORAUNT = "Great Great Grand Uncle/Aunt";
    public final static String GREATGREATGRANDUNCLE = "Great Great Grand Uncle";
    public final static String GREATGREATGRANDAUNT = "Great Great Grand Aunt";


    //3rd level
    public final static String GREATGRANDFATHER = "Great Grandfather";
    public final static String GREATGRANDMOTHER = "Great Grandmother";
    public final static String GREATGRANDPARENT = "Great Grandparent";

    public final static String GREATGRANDUNCLEORAUNT = "Great Grand Uncle/Aunt";
    public final static String GREATGRANDUNCLE = "Great Grand Uncle";
    public final static String GREATGRANDAUNT = "Great Grand Aunt";

    public final static String FIRSTCOUSINTHRICEREMOVED = "1st Cousin Thrice Removed";


    //4th level
    public final static String GRANDFATHER = "Grandfather";
    public final static String GRANDMOTHER = "Grandmother";
    public final static String GRANDPARENT = "Grandparent";

    public final static String GRANDUNCLEORAUNT = "Great Uncle/Aunt";
    public final static String GREATUNCLE = "Great Uncle";
    public final static String GREATAUNT = "Great Aunt";

    public final static String FIRSTCOUSINTWICEREMOVED = "1st Cousin Twice Removed";

    public final static String SECONDCOUSINTWICEREMOVED = "2nd Cousin Twice Removed";


    //5th level
    public final static String FATHER = "Father";
    public final static String MOTHER = "Mother";
    public final static String PARENT = "Parent";

    public final static String UNCLEORAUNT = "Uncle/Aunt";
    public final static String UNCLE = "Uncle";
    public final static String AUNT = "Aunt";

    public final static String FIRSTCOUSINONCEREMOVED = "1st Cousin Once Removed";

    public final static String SECONDCOUSINONCEREMOVED = "2nd Cousin Once Removed";

    public final static String THIRDCOUSINONCEREMOVED = "3rd Cousin Once Removed";


    //6th level
    public final static String ME = "Me";

    public final static String SISTER = "Sister";
    public final static String BROTHER = "Brother";
    public final static String SIBLING = "Sibling";

    public final static String COUSIN = "Cousin";

    public final static String SECONDCOUSIN = "2nd Cousin";

    public final static String THIRDCOUSIN = "3rd Cousin";

    public final static String FORTHCOUSIN = "4th Cousin";


    //7th level
    public final static String CHILD = "Child";
    public final static String SON = "Son";
    public final static String DAUGHTER = "Daughter";

    public final static String NIECEORNEPHEW = "Niece/Nephew";
    public final static String NIECE = "Niece";
    public final static String NEPHEW = "Nephew";


    public final static String GRANDSON = "Grand Son";
    public final static String GRANDDAUGHTER = "Grand Daughter";
    public final static String GRANDCHILD = "Grand Child";
    public final static String GRANDNIECEORNEPHEW = "Grand Niece/Nephew";
    public final static String GRANDNIECE = "Grand Niece";
    public final static String GRANDNEPHEW = "Grand Nephew";

    public final static String GREATGRANDSON = "Great Grand Son";
    public final static String GREATGRANDDAUGHTER = "Great Grand Daughter";
    public final static String GREATGRANDCHILD = "Great Grand Child";
    public final static String GREATGRANDNIECEORNEPHEW = "Great Grand Niece/Nephew";
    public final static String GREATGRANDNIECE = "Great Grand Niece";
    public final static String GREATGRANDNEPHEW = "Great Grand Nephew";



    //FAMILY TREE
    //1st level
    private static final BinaryTree third_great_grandfather = new BinaryTree(THIRDGREATGRANDFATHER);
    private static final BinaryTree third_great_grandmother = new BinaryTree(THIRDGREATGRANDMOTHER);
    private static final BinaryTree third_great_grandparent = new BinaryTree(THIRDGREATGRANDPARENT, new BinaryTree[]{third_great_grandfather,third_great_grandmother});


    //2nd level
    private static final BinaryTree great_great_grandfather = new BinaryTree(GREATGREATGRANDFATHER);
    private static final BinaryTree great_great_grandmother = new BinaryTree(GREATGREATGRANDMOTHER);
    private static final BinaryTree great_great_grandparent = new BinaryTree(GREATGREATGRANDPARENT , new BinaryTree[]{great_great_grandfather,great_great_grandmother});

    private static final BinaryTree great_great_granduncle = new BinaryTree(GREATGREATGRANDUNCLE);
    private static final BinaryTree great_great_grandaunt = new BinaryTree(GREATGREATGRANDAUNT);
    private static final BinaryTree great_great_granduncleoraunt = new BinaryTree(GREATGREATGRANDUNCLEORAUNT , new BinaryTree[]{great_great_granduncle,great_great_grandaunt});


    //3rd level
    private static final BinaryTree great_grandfather = new BinaryTree(GREATGRANDFATHER);
    private static final BinaryTree great_grandmother = new BinaryTree(GREATGRANDMOTHER);
    private static final BinaryTree great_grandparent = new BinaryTree(GREATGRANDPARENT , new BinaryTree[]{great_grandfather,great_grandmother});

    private static final BinaryTree great_granduncle = new BinaryTree(GREATGRANDUNCLE);
    private static final BinaryTree great_grandaunt = new BinaryTree(GREATGRANDAUNT);
    private static final BinaryTree great_granduncleoraunt = new BinaryTree(GREATGRANDUNCLEORAUNT , new BinaryTree[]{great_granduncle,great_grandaunt});

    private static final BinaryTree first_cousin_thrice_removed = new BinaryTree(FIRSTCOUSINTHRICEREMOVED);


    //4th level
    private static final BinaryTree grandfather = new BinaryTree(GRANDFATHER);
    private static final BinaryTree grandmother = new BinaryTree(GRANDMOTHER);
    private static final BinaryTree grandparent = new BinaryTree(GRANDPARENT , new BinaryTree[]{grandfather,grandmother});

    private static final BinaryTree granduncle = new BinaryTree(GREATUNCLE);
    private static final BinaryTree greataunt = new BinaryTree(GREATAUNT);
    private static final BinaryTree greatuncleoraunt = new BinaryTree(GRANDUNCLEORAUNT , new BinaryTree[]{granduncle, greataunt});

    private static final BinaryTree first_cousin_twice_removed = new BinaryTree(FIRSTCOUSINTWICEREMOVED);

    private static final BinaryTree second_cousin_twice_removed  = new BinaryTree(SECONDCOUSINTWICEREMOVED);


    //5th level
    private static final BinaryTree father = new BinaryTree(FATHER);
    private static final BinaryTree mother = new BinaryTree(MOTHER);
    private static final BinaryTree parent = new BinaryTree(PARENT , new BinaryTree[]{father,mother});

    private static final BinaryTree uncle = new BinaryTree(UNCLE);
    private static final BinaryTree aunt = new BinaryTree(AUNT);
    private static final BinaryTree uncleoraunt = new BinaryTree(UNCLEORAUNT , new BinaryTree[]{uncle,aunt});

    private static final BinaryTree first_cousin_once_removed = new BinaryTree(FIRSTCOUSINONCEREMOVED);

    private static final BinaryTree second_cousin_once_removed = new BinaryTree(SECONDCOUSINONCEREMOVED);

    private static final BinaryTree third_cousin_once_removed = new BinaryTree(THIRDCOUSINONCEREMOVED);


    //6th level
    private static final BinaryTree me = new BinaryTree(ME);

    private static final BinaryTree sister = new BinaryTree(SISTER);
    private static final BinaryTree brother = new BinaryTree(BROTHER);
    private static final BinaryTree sibling = new BinaryTree(SIBLING , new BinaryTree[]{brother , sister});

    private static final BinaryTree cousin = new BinaryTree(COUSIN);

    private static final BinaryTree second_cousin = new BinaryTree(SECONDCOUSIN);

    private static final BinaryTree third_cousin = new BinaryTree(THIRDCOUSIN);

    private static final BinaryTree forth_cousin = new BinaryTree(FORTHCOUSIN);


    //7th level
    private static final BinaryTree son = new BinaryTree(SON);
    private static final BinaryTree daughter = new BinaryTree(DAUGHTER);
    private static final BinaryTree child = new BinaryTree(CHILD , new BinaryTree[]{son , daughter});

    private static final BinaryTree niece = new BinaryTree(NIECE);
    private static final BinaryTree nephew = new BinaryTree(NEPHEW);
    private static final BinaryTree nieceornephew = new BinaryTree(NIECEORNEPHEW , new BinaryTree[]{niece , nephew});


    //8th level
    private static final BinaryTree grandson = new BinaryTree(GRANDSON);
    private static final BinaryTree granddaughter = new BinaryTree(GRANDDAUGHTER);
    private static final BinaryTree grandchild = new BinaryTree(GRANDCHILD , new BinaryTree[] {grandson , granddaughter});

    private static final BinaryTree grandniece = new BinaryTree(GRANDNIECE);
    private static final BinaryTree grandnephew = new BinaryTree(GRANDNEPHEW);
    private static final BinaryTree grandnieceornephew = new BinaryTree(GRANDNIECEORNEPHEW , new BinaryTree[] {grandniece , grandnephew});


    //9th level
    private static final BinaryTree great_grandson = new BinaryTree(GREATGRANDSON);
    private static final BinaryTree great_granddaughter = new BinaryTree(GREATGRANDDAUGHTER);
    private static final BinaryTree great_grandchild = new BinaryTree(GREATGRANDCHILD , new BinaryTree[] {great_grandson , great_granddaughter});

    private static final BinaryTree great_grandniece = new BinaryTree(GREATGRANDNIECE);
    private static final BinaryTree great_grandnephew = new BinaryTree(GREATGRANDNEPHEW);
    private static final BinaryTree great_grandnieceornephew = new BinaryTree(GREATGRANDNIECEORNEPHEW , new BinaryTree[] {great_grandniece , great_grandnephew});




    static {
        //1st Level
        third_great_grandparent.addLeftChild(great_great_grandparent);
        third_great_grandparent.addRightChild(great_great_granduncleoraunt);


        //2nd Level
        great_great_grandparent.addLeftChild(great_grandparent);
        great_great_grandparent.addRightChild(great_granduncleoraunt);

        great_great_granduncleoraunt.addLeftChild(first_cousin_thrice_removed);
        great_great_granduncleoraunt.addRightChild(great_great_granduncleoraunt.getLeft());


        //3rd level
        great_grandparent.addLeftChild(grandparent);
        great_grandparent.addRightChild(greatuncleoraunt);

        great_granduncleoraunt.addLeftChild(first_cousin_twice_removed);
        great_granduncleoraunt.addRightChild(great_granduncleoraunt.getLeft());

        first_cousin_thrice_removed.addLeftChild(second_cousin_twice_removed);
        first_cousin_thrice_removed.addRightChild(first_cousin_thrice_removed.getLeft());


        //4th level
        grandparent.addLeftChild(parent);
        grandparent.addRightChild(uncleoraunt);

        greatuncleoraunt.addLeftChild(first_cousin_once_removed);
        greatuncleoraunt.addRightChild(greatuncleoraunt.getLeft());

        first_cousin_twice_removed.addLeftChild(second_cousin_once_removed);
        first_cousin_twice_removed.addRightChild(first_cousin_twice_removed.getLeft());

        second_cousin_twice_removed.addLeftChild(third_cousin_once_removed);
        second_cousin_twice_removed.addRightChild(second_cousin_twice_removed.getLeft());


        //5th level
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


        me.addLeftChild(child);
        me.addRightChild(me.getLeft());
        sibling.addLeftChild(nieceornephew);
        sibling.addRightChild(sibling.getLeft());

        child.addLeftChild(grandchild);
        child.addRightChild(child.getLeft());
        nieceornephew.addLeftChild(grandnieceornephew);
        nieceornephew.addRightChild(nieceornephew.getLeft());

        grandchild.addLeftChild(great_grandchild);
        grandchild.addRightChild(grandchild.getLeft());
        grandnieceornephew.addLeftChild(great_grandnieceornephew);
        grandnieceornephew.addRightChild(grandnieceornephew.getLeft());
    }



    public static String calculateRelation(
            String person1,
            String person2
    ){
        BinaryTree p1;

        switch (person1) {
            //level 1
            case THIRDGREATGRANDFATHER, THIRDGREATGRANDMOTHER , THIRDGREATGRANDPARENT -> p1 = third_great_grandparent;

            //level 2
            case GREATGREATGRANDFATHER, GREATGREATGRANDMOTHER, GREATGREATGRANDPARENT -> p1 = great_great_grandparent;
            case GREATGREATGRANDUNCLE, GREATGREATGRANDAUNT, GREATGREATGRANDUNCLEORAUNT ->
                    p1 = great_great_granduncleoraunt;

            //level 3
            case GREATGRANDFATHER, GREATGRANDMOTHER, GREATGRANDPARENT -> p1 = great_grandparent;
            case GREATGRANDUNCLEORAUNT, GREATGRANDUNCLE, GREATGRANDAUNT -> p1 = great_granduncleoraunt;
            case FIRSTCOUSINTHRICEREMOVED -> p1 = first_cousin_thrice_removed;

            //level 4
            case GRANDFATHER, GRANDMOTHER, GRANDPARENT -> p1 = grandparent;
            case GRANDUNCLEORAUNT, GREATUNCLE, GREATAUNT -> p1 = greatuncleoraunt;
            case FIRSTCOUSINTWICEREMOVED -> p1 = first_cousin_twice_removed;
            case SECONDCOUSINTWICEREMOVED -> p1 = second_cousin_twice_removed;

            //level 5
            case FATHER, MOTHER, PARENT -> p1 = parent;
            case UNCLEORAUNT, UNCLE, AUNT -> p1 = uncleoraunt;
            case FIRSTCOUSINONCEREMOVED -> p1 = first_cousin_once_removed;
            case SECONDCOUSINONCEREMOVED -> p1 = second_cousin_once_removed;
            case THIRDCOUSINONCEREMOVED -> p1 = third_cousin_once_removed;

            //level 6
            case ME -> p1 = me;
            case SISTER, BROTHER, SIBLING -> p1 = sibling;
            case COUSIN -> p1 = cousin;
            case SECONDCOUSIN -> p1 = second_cousin;
            case THIRDCOUSIN -> p1 = third_cousin;
            case FORTHCOUSIN -> p1 = forth_cousin;

            //level 7
            case CHILD, SON, DAUGHTER -> p1 = child;
            case NIECEORNEPHEW, NIECE, NEPHEW -> p1 = nieceornephew;
            case GRANDSON, GRANDDAUGHTER, GRANDCHILD -> p1 = grandchild;
            case GRANDNIECEORNEPHEW, GRANDNIECE, GRANDNEPHEW -> p1 = grandnieceornephew;
            case GREATGRANDSON, GREATGRANDDAUGHTER, GREATGRANDCHILD -> p1 = great_grandchild;
            case GREATGRANDNIECEORNEPHEW, GREATGRANDNIECE, GREATGRANDNEPHEW -> p1 = great_grandnieceornephew;
            default -> {
                throw new IllegalArgumentException("Error - The relationship is not supported.");
            }
        }

        try {
            switch (person2) {
                case FATHER -> {
                    return p1.getParent().getArray()[0].getData();
                }
                case MOTHER -> {
                    return p1.getParent().getArray()[1].getData();
                }
                case BROTHER -> {
                    return p1.getParent().getRight().getArray()[0].getData();
                }
                case SISTER -> {
                    return p1.getParent().getRight().getArray()[1].getData();
                }
                case SON -> {
                    if (p1 == parent) return p1.getRight().getArray()[0].getData();
                    return p1.getLeft().getArray()[0].getData();
                }
                case DAUGHTER -> {
                    if (p1 == parent) return p1.getRight().getArray()[1].getData();
                    return p1.getLeft().getArray()[1].getData();
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

}
