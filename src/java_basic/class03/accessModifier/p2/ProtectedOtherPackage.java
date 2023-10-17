package java_basic.class03.accessModifier.p2;

import java_basic.class03.accessModifier.p1.*;

public class ProtectedOtherPackage extends ProtectedModifier {
    public static void main(String[] args) {

        ProtectedOtherPackage protectedOtherPackage = new ProtectedOtherPackage();
        protectedOtherPackage.printDetails();

//        getting public class
        PublicModifier publicModifier = new PublicModifier();
        publicModifier.name = "Asha";
        publicModifier.age = 24;
        publicModifier.printInfo();
    }

}
