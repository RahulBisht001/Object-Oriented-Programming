package diffenet_package;

import access.B;

public class OtherClass extends B {

    public OtherClass(int size, String name) {
        super(size, name);
    }

    public static void main(String[] args) {
        OtherClass oc = new OtherClass(32, "R");
        System.out.println(oc.getSize());
        // because size is set as protected, hence we are able
        // to access it in the subClass At different package whereas
        // arr and name are set as default, that's why they are not
        // available here.
    }

}
