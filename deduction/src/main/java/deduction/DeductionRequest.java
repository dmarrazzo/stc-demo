package deduction;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class DeductionRequest implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Amount")
   private java.lang.Float amount;

   @org.kie.api.definition.type.Label(value = "Status")
   private java.lang.String requestStatus;

   public DeductionRequest()
   {
   }

   public java.lang.Float getAmount()
   {
      return this.amount;
   }

   public void setAmount(java.lang.Float amount)
   {
      this.amount = amount;
   }

   public java.lang.String getRequestStatus()
   {
      return this.requestStatus;
   }

   public void setRequestStatus(java.lang.String requestStatus)
   {
      this.requestStatus = requestStatus;
   }

   public DeductionRequest(java.lang.Float amount, java.lang.String requestStatus)
   {
      this.amount = amount;
      this.requestStatus = requestStatus;
   }

}