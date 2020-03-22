package org.inframincer.day11.modifier02;

import org.inframincer.day11.modifier03.Other;

class SameClassChecker {

    public SameClassChecker() {
        this.publicMethod();
        this.protectedMethod();
        this.defaultMethod();
        this.privateMethod();
    }

    public void publicMethod() {
        System.out.println("SameClassChecker public method");
    }

    protected void protectedMethod() {
        System.out.println("SameClassChecker protected method");
    }

    void defaultMethod() {
        System.out.println("SameClassChecker default method");
    }

    private void privateMethod() {
        System.out.println("SameClassChecker private method");
    }
}

class OtherClassChecker {
    public OtherClassChecker() {
        Same same = new Same();
        same.publicMethod();
        same.protectedMethod();
        same.defaultMethod();
        // 'privateMethod()' has private access in 'org.inframincer.day11.modifier02.Same'
//         same.privateMethod();
    }
}

class SamePackageChecker extends Same {
    public SamePackageChecker() {
        this.publicMethod();
        this.protectedMethod();
        this.defaultMethod();
        // 'privateMethod()' has private access in 'org.inframincer.day11.modifier02.Same'
        // this.privateMethod();
    }
}

class OtherPackageChecker extends Other {
    public OtherPackageChecker() {
        this.publicMethod();
        this.protectedMethod();
        // 'defaultMethod()' is not public in 'org.inframincer.day11.modifier03.Other'.
        // Cannot be accessed from outside package
        // this.defaultMethod();
        // 'privateMethod()' has private access in 'org.inframincer.day11.modifier03.Other'
        // this.privateMethod();
        // 다른 패키지에서 public 이 아닌 것을 호출하려면
        // 상속을 받아서 protected 가 되어야함.
    }
}

class OtherClassOtherPackageChecker extends Other {
    public OtherClassOtherPackageChecker() {
        Other other = new Other();
        other.publicMethod();
        // 'protectedMethod()' has protected access in 'org.inframincer.day11.modifier03.Other'
        // other.protectedMethod();
        // 'defaultMethod()' is not public in 'org.inframincer.day11.modifier03.Other'.
        // Cannot be accessed from outside package
        // other.defaultMethod();
        // 'privateMethod()' has private access in 'org.inframincer.day11.modifier03.Other'
        // other.privateMethod();
    }
}
