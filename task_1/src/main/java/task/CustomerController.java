package main.java.task;

import java.util.ArrayList;
import java.util.List;

public class CustomerController {
  private List<Customer> customers;
  private MedicalRecordController recordController;

  public CustomerController(MedicalRecordController recordController) {
    this.customers = new ArrayList<>();
    this.recordController = recordController;
  }

  // 고객 정보 등록 메서드
  public void addCustomer(Customer customer) {
    customers.add(customer);
  }

  // 고객 정보를 삭제하는 메서드 (+ 반드시 해당 고객의 진료기록도 함께 삭제 해야한다)
  public void removeCustomer(String phoneNumber) {
    for(int i = 0; i < customers.size(); i++) {
      if(customers.get(i).getPhoneNumber().equals(phoneNumber)){
        customers.remove(i);
        recordController.removeMedicalRecord(phoneNumber); // 해당 고객의 진료 기록 삭제
        break;
      }
    }
  }

  // 고객 등록 여부 확인
  public Customer findCustomer(String phoneNumber) {
    for(Customer customer : customers){
      if(customer.getPhoneNumber().equals(phoneNumber)){
        return customer;
      }
    }
    return null;
  }

  // 전화번호 기준으로 중복 확인
  public boolean isPhoneNumberExist(String phoneNumber) {
    for(Customer customer : customers){
      if (customer.getPhoneNumber().equals(phoneNumber)){
        return true;
      }
    }
    return false;
  }
}
