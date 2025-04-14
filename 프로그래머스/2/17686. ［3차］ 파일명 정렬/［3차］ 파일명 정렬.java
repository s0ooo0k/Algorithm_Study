import java.util.*;
// HEAD : 대소문자 구분 X 사전순
// NUMBER : 숫자 오름차순
class Solution {
    public String[] solution(String[] files) {        
        // 1. 파일명 HEAD / NUMBER / TAIL로 자르기
        // 커스텀 객체 만들기
        List<FileInfo> fileList = new ArrayList<>();
        
        for(String file : files){
            fileList.add(parseFile(file));
        }
        
        Collections.sort(fileList, (f1, f2) -> {
            int headCompare = f1.head.toLowerCase().compareTo(f2.head.toLowerCase());
            if (headCompare != 0) return headCompare;
            
            return Integer.compare(f1.number, f2.number);
        });
        
        String[] answer = new String[files.length];
        for(int i=0; i<fileList.size(); i++) {
            answer[i]=fileList.get(i).original;
        }

        return answer;
    }
    
    // 파일명 파싱 메서드
    private FileInfo parseFile(String file){
        int i=0;
        int len=file.length();
        
        // HEAD
        StringBuilder head = new StringBuilder();
        while (i<len && !Character.isDigit(file.charAt(i))) {
            head.append(file.charAt(i));
            i++;
        }
        
        // NUMBER
         StringBuilder number = new StringBuilder();
        while (i < len && Character.isDigit(file.charAt(i)) && number.length() < 5) {
            number.append(file.charAt(i));
            i++;
        }
        
        String tail = file.substring(i); // tail은 사실 안 써도 됨
        return new FileInfo(head.toString(), Integer.parseInt(number.toString()), tail, file);
    }
}

// 커스텀 객체 정의
class FileInfo {
    String head;
    int number;
    String tail;
    String original;
    
    public FileInfo(String head, int number, String tail, String original) {
        this.head = head;
        this.number = number;
        this.tail = tail;
        this.original = original;
    }
}