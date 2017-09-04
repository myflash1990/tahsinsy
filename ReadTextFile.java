 
 
   public class ReadTextFile {

            public static String store = "";


            public static void main(String[] args) throws FileNotFoundException {

                String file = "/Users/tahsinsyeed/Desktop/test.txt";

                File f = new File(file);

                Scanner scan = new Scanner(f);

                int count = 1;
              
              while (scan.hasNextLine()) {

                    String line = scan.nextLine();
                   
                   //System.out.println(count +" : "+ line);
                   
                   count++;
                   
                   store += line;
                }
           System.out.println(store);

        scan.close();
        
        }
        
        }
