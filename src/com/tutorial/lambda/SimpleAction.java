package com.tutorial.lambda;


// MEMBUAT INTERFACE LAMBDA
@FunctionalInterface
public interface SimpleAction {

    String action();
}

// NOTE : harus ada 1 method didalamnya dan menggunakan anotation @FunctionalInterface
