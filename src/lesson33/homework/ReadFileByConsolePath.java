package lesson33.homework;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class ReadFileByConsolePath {
    public void readFileByConsolePath(){
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        System.out.println("Please, enter file path to read:");

        try {
            readFile(br.readLine());
        } catch (IOException e){
           return;
        }finally {
            IOUtils.closeQuietly(reader);
            IOUtils.closeQuietly(br);
        }




    }

    private void readFile(String path) {
        FileReader reader;
        try {
            reader = new FileReader(path);
        } catch (FileNotFoundException e){
            System.err.println("File with path " + path + " not found");
            return;
        }
        BufferedReader br = new BufferedReader(reader);

        try {
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.err.println("Can't read file by path " + path);
        }finally {
            IOUtils.closeQuietly(br);
            IOUtils.closeQuietly(reader);
        }

    }
}
