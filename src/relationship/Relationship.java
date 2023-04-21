package relationship;


import data_structure.BinaryTree;

public class Relationship {
    //https://www.mymcpl.org/sites/default/files/06-0395_ExtendedFamilyChart.pdf
    final static String GREATGREATGRANDFATHER = "Great Great Grandfather";
    final static String GREATGREATGRANDMOTHER = "Great Great Grandmother";
    final static String GREATGREATGRANDPARENT = "Great Great Grandparent";
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
    private static BinaryTree great_great_grandfather = new BinaryTree(GREATGREATGRANDFATHER);
    private static BinaryTree great_great_grandmother = new BinaryTree(GREATGREATGRANDMOTHER);
    private static BinaryTree great_great_grandparent = new BinaryTree(GREATGREATGRANDPARENT , new BinaryTree[]{great_great_grandfather,great_great_grandmother});

    private static BinaryTree great_grandfather = new BinaryTree(GREATGRANDFATHER);
    private static BinaryTree great_grandmother = new BinaryTree(GREATGRANDMOTHER);
    private static BinaryTree great_grandparent = new BinaryTree(GREATGRANDPARENT , new BinaryTree[]{great_grandfather,great_grandmother});
    private static BinaryTree great_granduncle = new BinaryTree(GREATGRANDUNCLE);
    private static BinaryTree great_grandaunt = new BinaryTree(GREATGRANDAUNT);
    private static BinaryTree great_granduncleoraunt = new BinaryTree(GREATGRANDUNCLEORAUNT , new BinaryTree[]{great_granduncle,great_grandaunt});

    private static BinaryTree grandfather = new BinaryTree(GRANDFATHER);
    private static BinaryTree grandmother = new BinaryTree(GRANDMOTHER);
    private static BinaryTree grandparent = new BinaryTree(GRANDPARENT , new BinaryTree[]{grandfather,grandmother});
    private static BinaryTree granduncle = new BinaryTree(GRANDUNCLE);
    private static BinaryTree grandaunt = new BinaryTree(GRANDAUNT);
    private static BinaryTree granduncleoraunt = new BinaryTree(GRANDUNCLEORAUNT , new BinaryTree[]{granduncle,grandaunt});

    private static BinaryTree father = new BinaryTree(FATHER);
    private static BinaryTree mother = new BinaryTree(MOTHER);
    private static BinaryTree parent = new BinaryTree(PARENT , new BinaryTree[]{father,mother});
    private static BinaryTree uncle = new BinaryTree(UNCLE);
    private static BinaryTree aunt = new BinaryTree(AUNT);
    private static BinaryTree uncleoraunt = new BinaryTree(UNCLEORAUNT , new BinaryTree[]{uncle,aunt});

    private static BinaryTree me = new BinaryTree(ME);
    private static BinaryTree sister = new BinaryTree(SISTER);
    private static BinaryTree brother = new BinaryTree(BROTHER);
    private static BinaryTree sibling = new BinaryTree(SIBLING , new BinaryTree[]{brother , sister});
    private static BinaryTree cousin = new BinaryTree(COUSIN);

    private static BinaryTree son = new BinaryTree(SON);
    private static BinaryTree daughter = new BinaryTree(DAUGHTER);
    private static BinaryTree child = new BinaryTree(CHILD , new BinaryTree[]{son , daughter});
    private static BinaryTree niece = new BinaryTree(NIECE);
    private static BinaryTree nephew = new BinaryTree(NEPHEW);
    private static BinaryTree nieceornephew = new BinaryTree(NIECEORNEPHEW , new BinaryTree[]{niece , nephew});

    private static BinaryTree grandson = new BinaryTree(GRANDSON);
    private static BinaryTree granddaughter = new BinaryTree(GRANDDAUGHTER);
    private static BinaryTree grandchild = new BinaryTree(GRANDCHILD , new BinaryTree[] {grandson , granddaughter});
    private static BinaryTree grandniece = new BinaryTree(GRANDNIECE);
    private static BinaryTree grandnephew = new BinaryTree(GRANDNEPHEW);
    private static BinaryTree grandnieceornephew = new BinaryTree(GRANDNIECEORNEPHEW , new BinaryTree[] {grandniece , grandnephew});

    private static BinaryTree great_grandson = new BinaryTree(GREATGRANDSON);
    private static BinaryTree great_granddaughter = new BinaryTree(GREATGRANDDAUGHTER);
    private static BinaryTree great_grandchild = new BinaryTree(GREATGRANDCHILD , new BinaryTree[] {great_grandson , great_granddaughter});
    private static BinaryTree great_grandniece = new BinaryTree(GREATGRANDNIECE);
    private static BinaryTree great_grandnephew = new BinaryTree(GREATGRANDNEPHEW);
    private static BinaryTree great_grandnieceornephew = new BinaryTree(GREATGRANDNIECEORNEPHEW , new BinaryTree[] {great_grandniece , great_grandnephew});




    static {
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



    public static String calcalculateRelation(
            String person1,
            String person2
    ){

        return ME;
    }
}
