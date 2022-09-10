
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class EnglishWords implements List<String> {
    static List<String> lines;
    static int lengthOfLines = 0;
    
    public EnglishWords(Path file){

        try{
        EnglishWords.lines=Files.readAllLines(file);
        EnglishWords.lengthOfLines = lines.size();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static int getLengthOfLines() {
        return lengthOfLines;
    }

    @Override
    public boolean add(String e) {
        return false;
    }
    @Override
    public void add(int arg0, String arg1) {
    }
    @Override
    public boolean addAll(Collection<? extends String> c) {
        return false;
    }
    @Override
    public boolean addAll(int arg0, Collection<? extends String> arg1) {
        return false;
    }
    @Override
    public void clear() {
        
    }
    @Override
    public boolean contains(Object o) {
        return false;
    }
    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }
    @Override
    public String get(int index) {
        return lines.get(index);
    }
    @Override
    public int indexOf(Object o) {
        return lines.indexOf(o);
    }
    @Override
    public boolean isEmpty() {
        return false;
    }
    @Override
    public Iterator<String> iterator() {
        return null;
    }
    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }
    @Override
    public ListIterator<String> listIterator() {
        return null;
    }
    @Override
    public ListIterator<String> listIterator(int index) {
        return null;
    }
    @Override
    public boolean remove(Object o) {
        return false;
    }
    @Override
    public String remove(int index) {
        return null;
    }
    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }
    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }
    @Override
    public String set(int arg0, String arg1) {
        return null;
    }
    @Override
    public int size() {
        return 0;
    }
    @Override
    public List<String> subList(int arg0, int arg1) {
        return null;
    }
    @Override
    public Object[] toArray() {
        return null;
    }
    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

}
