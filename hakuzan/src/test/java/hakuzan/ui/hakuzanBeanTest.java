/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hakuzan.ui;

import jakarta.ejb.embeddable.EJBContainer;
import jakarta.inject.Inject;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author kamba
 */
public class HakuzanBeanTest {
    
    @Inject
    private HakuzanBean hakuzanBean;
    
    @Test
    void test_GenerateCode_twosum(){
       
        try{
            var actual = hakuzanBean.generateCode();
            var expected = "aaa";

            assertThat(actual).isEqualTo(expected);
        }
        catch(Exception ex){
            int a = 0;
        }

    }
}