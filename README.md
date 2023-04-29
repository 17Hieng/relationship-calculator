# Relation Calculator (v1.0.2)

## Change Log
> #### Fix Incorrect Name(29042023T1843)
> - Change "Grand Uncle/Aunt" to "Great Uncle/Aunt"
> #### Fix Cousin relationship return null issue(29042023T1923)
> #### Support More Relationship(29042023T1924)
> - Added the following relatives
> ```3rd Great Grandparent```
> ```1st Cousin Thrice Removed```
> ```1st Cousin Twice Removed```
> ```2nd Cousin Twice Removed```
> ```1st Cousin Once Removed```
> ```2nd Cousin Once Removed```
> ```3th Cousin Once Removed```
> ```2nd Cousin```
> ```3th Cousin```
> ```4th Cousin```
> #### New Method(30042023T0147)
> ``public static String calculateNestedRelation(
String person1,
String[] personList
)``
> - Calculate nested relationship
> 

## Introduction
> Relation Calculator is used to calculate the relationship with your relatives.
> Eg: What I should address my sister's son?
> `Relationship.calculateRelation(Relationship.SISTER , Relationship.SON)`

## List of Person
     GREATGREATGRANDFATHER
     GREATGREATGRANDMOTHER 
     GREATGREATGRANDPARENT 
     GREATGREATGRANDUNCLEORAUNT
     GREATGREATGRANDUNCLE
     GREATGREATGRANDAUNT
     GREATGRANDFATHER
     GREATGRANDMOTHER
     GREATGRANDPARENT
     GREATGRANDUNCLEORAUNT
     GREATGRANDUNCLE
     GREATGRANDAUNT
     GRANDFATHER
     GRANDMOTHER
     GRANDPARENT
     GRANDUNCLEORAUNT
     GRANDUNCLE
     GRANDAUNT
     FATHER
     MOTHER
     PARENT 
     UNCLEORAUNT 
     UNCLE 
     AUNT 
     ME 
     SISTER 
     BROTHER 
     SIBLING 
     COUSIN 
     CHILD 
     SON 
     DAUGHTER 
     NIECEORNEPHEW 
     NIECE 
     NEPHEW 
     GRANDSON
     GRANDDAUGHTER
     GRANDCHILD 
     GRANDNIECEORNEPHEW 
     GRANDNIECE 
     GRANDNEPHEW 
     GREATGRANDSON 
     GREATGRANDDAUGHTER 
     GREATGRANDCHILD 
     GREATGRANDNIECEORNEPHEW 
     GREATGRANDNIECE 
     GREATGRANDNEPHEW 


## Usage
> ## calculateRelation method
> - Calculate one relationship each times
> 
> `Relationship.calculateRelation(String person1 , String person2);`
> 
> @param person1 do not support `n`th Cousin `n` Removed
> 
> @param person2 only support `FATHER` , `MOTHER` , `BROTHER` , `SISTER` , `SON` , `DAUGHTER` , `ME`
> 
> @return addressing of the relative
> 
>
> 
> 
> ## calculateNestRelation method
> - Calculate nested relationship
> 
> `Relationship.calculateRelation(String person1 , String[] personList);`
> 
> @param person1 do not support `n`th Cousin `n` Removed
> 
> @param personList is list of nested relationship
> 
> - Eg: ``My Father's Mother's Sister's Daughter``
> - ``personList[] = new String[]{Relationship.FATHER , Relationship.MOTHER , Relationship.SISTER , Relationship.DAUGHTER};``