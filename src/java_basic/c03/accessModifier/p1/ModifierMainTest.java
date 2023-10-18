package java_basic.c03.accessModifier.p1;

public class ModifierMainTest {
    public static void main(String[] args) {
        DefaultModifier defaultModifier = new DefaultModifier();
        defaultModifier.name = "Asha";
        defaultModifier.age = 24;
        defaultModifier.address = "Mymensingh, Dhaka";
        defaultModifier.printInfo();

        System.out.println("-----^------");

        PrivateModifier privateModifier = new PrivateModifier();
        privateModifier.name = "Private";
        privateModifier.age = 24;
        privateModifier.setId(1023);
//        privateModifier.getId();
        privateModifier.printInfo();

        System.out.println("-----^------");

        ProtectedModifier protectedModifier = new ProtectedModifier();
        protectedModifier.printDetails();

        System.out.println("-----^------");

        PublicModifier publicModifier = new PublicModifier();
        publicModifier.name="Mukti";
        publicModifier.age = 25;
        publicModifier.printInfo();
    }
}
