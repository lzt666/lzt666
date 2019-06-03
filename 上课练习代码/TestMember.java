package ClassLoader.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class TestMember {
    public static void main(String[] args) {
        Class cls = Member.class;
       /* Annotation[] annotations = cls.getAnnotations();
        for(Annotation  annotation :  annotations){
            System.out.println(annotation);
        }*/
       try{
           Method method=cls.getMethod("toString");
           Annotation[] annotations=method.getAnnotations();
           for (Annotation annotation:annotations){
               System.out.println(annotation);
           }
       } catch (NoSuchMethodException e) {
           e.printStackTrace();
       }
    }
}

