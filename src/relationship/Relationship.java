package relationship;


import data_structure.BinaryTree;

public class Relationship {
    //https://www.mymcpl.org/sites/default/files/06-0395_ExtendedFamilyChart.pdf
    final static String GREATGREATGRANDFATHER = "Great Great Grandfather";
    final static String GREATGREATGRANDMOTHER = "Great Great Grandmother";
    final static String GREATGREATGRANDPARENT = "Great Great Grandparent";
    final static String GREATGREATGRANDUNCLEORAUNT = "Great Great Grand Uncle/Aunt";
    final static String GREATGREATGRANDUNCLE = "Great Great Grand Uncle";
    final static String GREATGREATGRANDAUNT = "Great Great Grand Aunt";

    final static String GREATGRANDFATHER = "Great Grandfather";
    final static String GREATGRANDMOTHER = "Great Grandmother";
    final static String GREATGRANDPARENT = "Great Grandparent";
    final static String GREATGRANDUNCLEORAUNT = "Great Grand Uncle/Aunt";
    final static String GREATGRANDUNCLE = "Great Grand Uncle";
    final static String GREATGRANDAUNT = "Great Grand Aunt";

    final static String GRANDFATHER = "Grandfather";
    final static String GRANDMOTHER = "Grandmother";
    final static String GRANDPARENT = "Grandparent";
    final static String GRANDUNCLEORAUNT = "Grand Uncle/Aunt";
    final static String GRANDUNCLE = "Grand Uncle";
    final static String GRANDAUNT = "Grand Aunt";

    final static String FATHER = "Father";
    final static String MOTHER = "Mother";
    final static String PARENT = "Parent";
    final static String UNCLEORAUNT = "Uncle/Aunt";
    final static String UNCLE = "Uncle";
    final static String AUNT = "Aunt";


    final static String ME = "Me";
    final static String SISTER = "Sister";
    final static String BROTHER = "Brother";
    final static String SIBLING = "Sibling";
    final static String COUSIN = "Cousin";

    final static String CHILD = "Child";
    final static String SON = "Son";
    final static String DAUGHTER = "Daughter";
    final static String NIECEORNEPHEW = "Niece/Nephew";
    final static String NIECE = "Niece";
    final static String NEPHEW = "Nephew";

    final static String GRANDSON = "Grand Son";
    final static String GRANDDAUGHTER = "Grand Daughter";
    final static String GRANDCHILD = "Grand Child";
    final static String GRANDNIECEORNEPHEW = "Grand Niece/Nephew";
    final static String GRANDNIECE = "Grand Niece";
    final static String GRANDNEPHEW = "Grand Nephew";

    final static String GREATGRANDSON = "Great Grand Son";
    final static String GREATGRANDDAUGHTER = "Great Grand Daughter";
    final static String GREATGRANDCHILD = "Great Grand Child";
    final static String GREATGRANDNIECEORNEPHEW = "Great Grand Niece/Nephew";
    final static String GREATGRANDNIECE = "Great Grand Niece";
    final static String GREATGRANDNEPHEW = "Great Grand Nephew";



    //family tree
    private static final BinaryTree great_great_grandfather = new BinaryTree(GREATGREATGRANDFATHER);
    private static final BinaryTree great_great_grandmother = new BinaryTree(GREATGREATGRANDMOTHER);
    private static final BinaryTree great_great_grandparent = new BinaryTree(GREATGREATGRANDPARENT , new BinaryTree[]{great_great_grandfather,great_great_grandmother});
    private static final BinaryTree great_great_granduncle = new BinaryTree(GREATGREATGRANDUNCLE);
    private static final BinaryTree great_great_grandaunt = new BinaryTree(GREATGREATGRANDAUNT);
    private static final BinaryTree great_great_granduncleoraunt = new BinaryTree(GREATGREATGRANDUNCLEORAUNT , new BinaryTree[]{great_great_granduncle,great_great_grandaunt});

    private static final BinaryTree great_grandfather = new BinaryTree(GREATGRANDFATHER);
    private static final BinaryTree great_grandmother = new BinaryTree(GREATGRANDMOTHER);
    private static final BinaryTree great_grandparent = new BinaryTree(GREATGRANDPARENT , new BinaryTree[]{great_grandfather,great_grandmother});
    private static final BinaryTree great_granduncle = new BinaryTree(GREATGRANDUNCLE);
    private static final BinaryTree great_grandaunt = new BinaryTree(GREATGRANDAUNT);
    private static final BinaryTree great_granduncleoraunt = new BinaryTree(GREATGRANDUNCLEORAUNT , new BinaryTree[]{great_granduncle,great_grandaunt});

    private static final BinaryTree grandfather = new BinaryTree(GRANDFATHER);
    private static final BinaryTree grandmother = new BinaryTree(GRANDMOTHER);
    private static final BinaryTree grandparent = new BinaryTree(GRANDPARENT , new BinaryTree[]{grandfather,grandmother});
    private static final BinaryTree granduncle = new BinaryTree(GRANDUNCLE);
    private static final BinaryTree grandaunt = new BinaryTree(GRANDAUNT);
    private static final BinaryTree granduncleoraunt = new BinaryTree(GRANDUNCLEORAUNT , new BinaryTree[]{granduncle,grandaunt});

    private static final BinaryTree father = new BinaryTree(FATHER);
    private static final BinaryTree mother = new BinaryTree(MOTHER);
    private static final BinaryTree parent = new BinaryTree(PARENT , new BinaryTree[]{father,mother});
    private static final BinaryTree uncle = new BinaryTree(UNCLE);
    private static final BinaryTree aunt = new BinaryTree(AUNT);
    private static final BinaryTree uncleoraunt = new BinaryTree(UNCLEORAUNT , new BinaryTree[]{uncle,aunt});

    private static final BinaryTree me = new BinaryTree(ME);
    private static final BinaryTree sister = new BinaryTree(SISTER);
    private static final BinaryTree brother = new BinaryTree(BROTHER);
    private static final BinaryTree sibling = new BinaryTree(SIBLING , new BinaryTree[]{brother , sister});
    private static final BinaryTree cousin = new BinaryTree(COUSIN);

    private static final BinaryTree son = new BinaryTree(SON);
    private static final BinaryTree daughter = new BinaryTree(DAUGHTER);
    private static final BinaryTree child = new BinaryTree(CHILD , new BinaryTree[]{son , daughter});
    private static final BinaryTree niece = new BinaryTree(NIECE);
    private static final BinaryTree nephew = new BinaryTree(NEPHEW);
    private static final BinaryTree nieceornephew = new BinaryTree(NIECEORNEPHEW , new BinaryTree[]{niece , nephew});

    private static final BinaryTree grandson = new BinaryTree(GRANDSON);
    private static final BinaryTree granddaughter = new BinaryTree(GRANDDAUGHTER);
    private static final BinaryTree grandchild = new BinaryTree(GRANDCHILD , new BinaryTree[] {grandson , granddaughter});
    private static final BinaryTree grandniece = new BinaryTree(GRANDNIECE);
    private static final BinaryTree grandnephew = new BinaryTree(GRANDNEPHEW);
    private static final BinaryTree grandnieceornephew = new BinaryTree(GRANDNIECEORNEPHEW , new BinaryTree[] {grandniece , grandnephew});

    private static final BinaryTree great_grandson = new BinaryTree(GREATGRANDSON);
    private static final BinaryTree great_granddaughter = new BinaryTree(GREATGRANDDAUGHTER);
    private static final BinaryTree great_grandchild = new BinaryTree(GREATGRANDCHILD , new BinaryTree[] {great_grandson , great_granddaughter});
    private static final BinaryTree great_grandniece = new BinaryTree(GREATGRANDNIECE);
    private static final BinaryTree great_grandnephew = new BinaryTree(GREATGRANDNEPHEW);
    private static final BinaryTree great_grandnieceornephew = new BinaryTree(GREATGRANDNIECEORNEPHEW , new BinaryTree[] {great_grandniece , great_grandnephew});

    private static final BinaryTree ancestor = new BinaryTree("Ancestor");



    static {
        ancestor.addLeftChild(great_great_grandparent);
        ancestor.addRightChild(great_great_granduncleoraunt);

        great_great_grandparent.addLeftChild(great_grandparent);
        great_great_grandparent.addLeftChild(great_granduncleoraunt);

        great_grandparent.addLeftChild(grandparent);
        great_grandparent.addLeftChild(granduncleoraunt);

        grandparent.addLeftChild(parent);
        grandparent.addLeftChild(uncleoraunt);

        parent.addLeftChild(me);
        parent.addRightChild(sibling);
        uncleoraunt.addLeftChild(cousin);
        uncleoraunt.addRightChild(uncleoraunt.getLeft());

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
            case GREATGREATGRANDFATHER, GREATGREATGRANDMOTHER, GREATGREATGRANDPARENT -> p1 = great_great_grandparent;
            case GREATGREATGRANDUNCLE, GREATGREATGRANDAUNT, GREATGREATGRANDUNCLEORAUNT ->
                    p1 = great_great_granduncleoraunt;
            case GREATGRANDFATHER, GREATGRANDMOTHER, GREATGRANDPARENT -> p1 = great_grandparent;
            case GREATGRANDUNCLEORAUNT, GREATGRANDUNCLE, GREATGRANDAUNT -> p1 = great_granduncleoraunt;
            case GRANDFATHER, GRANDMOTHER, GRANDPARENT -> p1 = grandparent;
            case GRANDUNCLEORAUNT, GRANDUNCLE, GRANDAUNT -> p1 = granduncleoraunt;
            case FATHER, MOTHER, PARENT -> p1 = parent;
            case UNCLEORAUNT, UNCLE, AUNT -> p1 = uncleoraunt;
            case ME -> p1 = me;
            case SISTER, BROTHER, SIBLING -> p1 = sibling;
            case COUSIN -> p1 = cousin;
            case CHILD, SON, DAUGHTER -> p1 = child;
            case NIECEORNEPHEW, NIECE, NEPHEW -> p1 = nieceornephew;
            case GRANDSON, GRANDDAUGHTER, GRANDCHILD -> p1 = grandchild;
            case GRANDNIECEORNEPHEW, GRANDNIECE, GRANDNEPHEW -> p1 = grandnieceornephew;
            case GREATGRANDSON, GREATGRANDDAUGHTER, GREATGRANDCHILD -> p1 = great_grandchild;
            case GREATGRANDNIECEORNEPHEW, GREATGRANDNIECE, GREATGRANDNEPHEW -> p1 = great_grandnieceornephew;
            default -> {
                return "Error - Unknown Family member.";
            }
        }

        switch (person2){
            case FATHER -> {
                try {
                    return p1.getParent().getArray()[0].getData();
                } catch (NullPointerException e) {
                    return "Error - The relationship calculation is not supported.";
                }
            }
            case MOTHER -> {
                try {
                    return p1.getParent().getArray()[1].getData();
                } catch (NullPointerException e) {
                    return "Error - The relationship calculation is not supported.";
                }
            }
            case BROTHER -> {
                try {
                    return p1.getParent().getRight().getArray()[0].getData();
                } catch (NullPointerException e) {
                    return "Error - The relationship calculation is not supported.";
                }
            }
            case SISTER -> {
                try {
                    return p1.getParent().getRight().getArray()[1].getData();
                } catch (NullPointerException e) {
                    return "Error - The relationship calculation is not supported.";
                }
            }
            case SON -> {
                try {
                    return p1.getLeft().getArray()[0].getData();
                } catch (NullPointerException e) {
                    return "Error - The relationship calculation is not supported.";
                }
            }
            case DAUGHTER -> {
                try {
                    return p1.getLeft().getArray()[1].getData();
                } catch (NullPointerException e) {
                    return "Error - The relationship calculation is not supported.";
                }
            }
            case ME -> {
                return ME;
            }
            default -> {
                return "Error - The relationship calculation is not supported.";
            }
        }
    }
}
