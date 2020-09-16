package com.udacity.springbootunittests;

import com.udacity.springbootunittests.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {SpringBootUnitTestsApplication.class})
public class UserSeriviceTest {
  
  @Resource
  private UserService userService;
  
  @Test
  public void testGetUser() {
    Assert.assertEquals(userService.getUser(), "Tom");
  }
  
}
