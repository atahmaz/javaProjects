package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.business.abstracts.EmployeeValidationService;
import kodlamaio.hrms.business.abstracts.UserActivationService;
import kodlamaio.hrms.business.abstracts.UserCheckService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	@Autowired
	private UserActivationService userActivationService;
	@Autowired
	private UserCheckService userCheckService;
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private EmployeeValidationService employeeValidationService;
	
	
	
	
	public EmployeeManager(UserActivationService userActivationService, UserCheckService userCheckService, EmployeeDao employeeDao,
			EmployeeValidationService employeeValidationService) {
		super();
		this.userActivationService = userActivationService;
		this.userCheckService = userCheckService;
		this.employeeDao = employeeDao;
		this.employeeValidationService=employeeValidationService;
	}

	@Override
	public Result register(Employee employee) throws Exception {
	
		List<Employee> employees = this.employeeDao.findAll();
		if (this.userCheckService.IfUserRealPerson(employee)) {
			
			if (this.userActivationService.activate()) {
				
				checkIfUserExistsBefore(employees, employee);
				if (checkIfUserExistsBefore(employees, employee).isSuccess()) {
					
					employeeValidationService.validate(employee);
					this.employeeDao.save(employee);
					return new SuccessResult("Kay??t olma i??lemi ba??ar??yla ger??ekle??ti.");
				}										
				
			}	
			
			return new ErrorResult("L??tfen mail adresine g??nderilen aktivasyon kodu ile aktivasyon i??lemini ger??ekle??tiriniz.");
		}
		
		return new ErrorResult("L??tfen kullan??c?? bilgilerini do??ru ??ekilde giriniz.");
	}	
	
	  private Result checkIfUserExistsBefore(List<Employee> employees, Employee checkEmployee){
	        for (Employee employee: employees) {
	            if (employee.getEmail().equals(checkEmployee.getEmail())){
	                return new ErrorResult("Bu email mevcut.");
	            }
	            if (employee.getIdentityNumber().equals(checkEmployee.getIdentityNumber())){
	                return new ErrorResult("Bu kimlik numaras?? zaten mevcut.");
	            }
	        }
	        return new SuccessResult();
	    }

	@Override
	public DataResult<List<Employee>> getAll() {
		 return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(),"Ba??ar??yla Listelendi");
	}

}





