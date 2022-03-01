package com.spring.JPA;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.JPA.entity.Memo;
import com.spring.JPA.repository.MemoRepository;

@SpringBootTest
class JpaApplicationTests {

	@Autowired
	MemoRepository memoRepository;

	/*
	  @Test public void InsertDummies() {
	  
	  IntStream.rangeClosed(1, 10).forEach(i -> { Memo memo =
	  Memo.builder().memoText("Sample..." + i).build(); memoRepository.save(memo);
	  
	  });
	  
	  }
	 */
//	=======================================================================
	/*
	  @Test
	  public void selectDummies() {
	  
	  Long id = 10L; Optional<Memo> result = memoRepository.findById(id);
	  
	  System.out.println("================================");
	  
	  if(result.isPresent()) { Memo memo = result.get(); System.out.println(memo);
	  }
	  
	  }
	 */
	
//	=======================================================================
	/*
	  @Test
	  public void UpdateDummies() { Memo memo = Memo.builder() .id(10L)
	  .memoText("Update Text") .build();
	  
	  memoRepository.save(memo); }
	 */
	
//	=======================================================================
	
	@Test
	public void DeleteDummies() {
		Long id = 10L;
		
		memoRepository.deleteById(id);
	}
	
	
}
