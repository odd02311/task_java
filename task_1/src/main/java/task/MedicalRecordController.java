package main.java.task;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecordController {
  private List<MedicalRecord> records = new ArrayList<>();

  // 진료기록을 등록하는 메서드
  public void addMedicalRecord(MedicalRecord record) {
    records.add(record);
  }

  // 진료기록을 삭제하는 메서드
  public void removeMedicalRecord(String phoneNumber) {
    for(int i = 0; i < records.size(); i++){
      if(records.get(i).getPhoneNumber().equals(phoneNumber)){
        records.remove(i);
        break;
      }
    }
  }

  // 전화번호에 해당하는 모든 진료기록을 검색하여 새로운 List<MedicalRecord를 만들어주는 메서드
  // List<MedicalRecord> 여러 동물의 진료 기록이 있다. 그중에서 전화번호에서 일치하는 것을 뽑아서
  // 다시 새로운 record로 만들어줘야 그 해당 기록만 출력 할 수있다. (검색)
  public List<MedicalRecord> findMedicalRecords(String phoneNumber) {
    List<MedicalRecord> result = new ArrayList<>();
    for(MedicalRecord record : records) {
      if(record.getPhoneNumber().equals(phoneNumber)){
        result.add(record);
      }
    }
    return result;
  }


}
