import java.io.*;


public class Main {
    public static void main(String[] args) {
String input = "first.txt";
String output = "second.txt";
try{
    BufferedReader reader = new BufferedReader(new FileReader(input));
    BufferedWriter writer = new BufferedWriter(new FileWriter(output));
String line;
while((line = reader.readLine())!=null){

    String decodedLine = line.replaceAll("\\b[ПпЗзНнВвУуЗзАаОоБбиИеЕ]\\b", "Java");

writer.write(decodedLine);
writer.newLine();

}
reader.close();
writer.close();
System.out.println("Прийменники були успішно замінені.");




} catch (IOException e){
    e.printStackTrace();




}

    }
}