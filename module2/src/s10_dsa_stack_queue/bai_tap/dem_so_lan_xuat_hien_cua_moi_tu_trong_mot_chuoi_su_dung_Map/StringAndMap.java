package s10_dsa_stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu_trong_mot_chuoi_su_dung_Map;
import java.util.Map;
import java.util.TreeMap;
public class StringAndMap {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
    public static final char DOT = '.';
    public static void main(String[] args) {
        String str = "hoc java    co ban den nang cao"
                + "      \n hoc javascript co ban den nang cao.";
        System.out.println(str);
        System.out.println("---------------------------------");
        System.out.println("Liet ke so lan xuat hien cua cac tu: ");
        Map<String, Integer> wordMap = countWords(str);
        for (String key : wordMap.keySet()) {
            System.out.println(key + " " + wordMap.get(key));
        }
    }

    /**
     * Đếm số từ của một chuỗi,
     * giả sử các từ được ngăn cách nhau bởi một hoặc nhiều
     * dấu 'space', tab '\t' và xuống dòng '\n'
     *
     * @param input - chuỗi ký tự
     * @return số từ của chuỗi ký tự input
     */
    public static Map<String, Integer> countWords(String input) {
        // khởi tạo wordMap
        Map<String, Integer> wordMap = new TreeMap<String, Integer>();
        if (input == null) {
            return wordMap;
        }
        int size = input.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB
                    && input.charAt(i) != BREAK_LINE && input.charAt(i) != DOT) {
                // build một từ
                sb.append(input.charAt(i));
            } else {
                // thêm từ vào wordMap
                addWord(wordMap, sb);
                sb = new StringBuilder();
            }
        }
        // thêm từ cuối cùng tìm được vào wordMap
        addWord(wordMap, sb);
        return wordMap;
    }

    /**
     * Thêm từ vào wordMap
     *
     * @param wordMap: map chứa các từ và số lần xuất hiện
     * @param sb: từ cần thêm vào wordMap
     */
    public static void addWord(Map<String, Integer> wordMap, StringBuilder sb) {
        String word = sb.toString();
        if (word.length() == 0) {
            return;
        }
        if (wordMap.containsKey(word)) {
            int count = wordMap.get(word) + 1;
            wordMap.put(word, count);
        } else {
            wordMap.put(word, 1);
        }
    }
}
