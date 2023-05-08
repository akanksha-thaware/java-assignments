package Question3;

class Functions {
    static void funcA(InterfaceA obj) {
        obj.methodA1();
        obj.methodA2();
    }

    static void funcB(InterfaceB obj) {
        obj.methodB1();
        obj.methodB2();
    }

    static void funcC(InterfaceC obj) {
        obj.methodC1();
        obj.methodC2();
    }

    static void funcD(CombinedInterface obj) {
        obj.methodA1();
        obj.methodB2();
        obj.methodC1();
        obj.methodD();
    }
}
