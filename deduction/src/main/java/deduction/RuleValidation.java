package deduction;

import java.util.HashMap;
import java.util.Map;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class RuleValidation implements java.io.Serializable
{
   
   static final long serialVersionUID = 1L;

    private Map<String, String> englishMessages = new HashMap<String, String>();
	private Map<String, String> arabicMessages = new HashMap<String, String>();
       
   private java.lang.String key;


   public RuleValidation()
   {
       englishMessages.put("rule01","Error while fetching your data, Please try again later");
       arabicMessages.put("rule01","عذرا حصل خطا اثناء محاولة استعادة بياناتك, الرجاء المحاولة في وقت لاحق");
       
       englishMessages.put("rule02","Deduction amount cannot be greater than net salary");
       arabicMessages.put("rule02","المبلغ المراد خصمه لا يمكن ان يكون اكبر من اجمالي الراتب");
       
       englishMessages.put("rule03","");
       englishMessages.put("rule04","");
       
       
       arabicMessages.put("rule03","");
       arabicMessages.put("rule04","");
   }

   public java.lang.String getKey()
   {
      return this.key;
   }

   public void setKey(java.lang.String key)
   {
      this.key = key;
   }

   public java.lang.String getMessage(String key,String lang)
   {
      return lang.equals("ar")?arabicMessages.get(key):englishMessages.get(key);
   }

   
   public RuleValidation(java.lang.String key)
   {
      this();
      this.key = key;
   }

}