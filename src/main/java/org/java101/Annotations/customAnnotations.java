package org.java101.Annotations;

public class customAnnotations {

    @MyAnnotation(value = "Custom Annotation Example")
    public void display() {
        System.out.println("Display method called");
    }

    public static void main(String[] args) throws Exception {
        customAnnotations obj = new customAnnotations();
        obj.display();

        // Reading annotation through Reflection
        MyAnnotation annotation = obj.getClass().getMethod("display").getAnnotation(MyAnnotation.class);
        System.out.println("Annotation Value: " + annotation.value());
    }
}

/*
Custom Annotation	    Use
@interface keyword	    Create your own annotation
@Retention, @Target	    Control how and where annotations apply
 */


