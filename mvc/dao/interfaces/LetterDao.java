package com.springapp.mvc.dao.interfaces;




import com.springapp.mvc.domain.letter.Letter;
import java.util.List;

public interface LetterDao {
    public List<Letter> getListLetter();
//    public List<String[]> listMachineForSiteMap();
//    public Hmc getMachine(String productId);
    public void addLetter(Letter letter);
//    public List<Hmc> listFiltered(String[] brandArr, int[] yearRangeArr, int[] priceRangeArr,
//        String[] locationArr, String[] cncArr, int[] xMotionRangeArr, int[] yMotionRangeArr,
//        int[] zMotionRangeArr,int[] xTableRangeArr, int[] yTableRangeArr);
//    public void editMachine(Hmc machine);
//    public List<Hmc> randomListMachine();
//    public List<Hmc> newArrivalsList();
}
