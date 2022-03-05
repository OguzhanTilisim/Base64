package edu.umsl;
import java.util.Scanner;
import org.apache.commons.codec.binary.Base64;
public class pro3 {
    public static void main(String[] args){
        //our plan is first, get input by user and decode it. After process, we are going convert them byte.
        //Decode and print out: SSBsb3ZlIG15IENNUCBTQ0kgMjI2MSBjbGFzcyBzbyBtdWNoLCBJIHdpc2ggSSBjb3VsZCBiZSBqdXN0IGFzIGNvb2wgYXMgbXkgcHJvZmVzc29y
        //Takes in a string and Encodes that string then prints to standard output.
        //For this project, we will be using the org.apache.commons.codec.binary.Base64 class from the Apache Commons Codec library.
        Scanner user = new Scanner(System.in);
        System.out.println("Enter your thing for decode ");
        String decodeStringI =user.nextLine();
        byte[] decodeBase = Base64.decode(decodeStringI);
        String decodeStringA= new String(decodeBase);
        System.out.println(decodeStringA);

        //our plan is reverse the first plan

        System.out.println("Enter your thing for encode");
        String encodeStringI =input.nextLine();
        byte[] encodeBaseI = encodeStringI.getBytes();
        byte[] encodeBaseA= Base64.encode(encodeBaseI);
        String encodeStringA- new String(encodeBaseA);
        System.out.println(encodeStringA);


    }

}
