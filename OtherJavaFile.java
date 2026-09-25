import java.io.Serializable;

class Save1 implements Serializable
{
	String sFrom, sTo, sClass, sBookingDate, sTime;
	Integer iPrice, iAdult, iChildren, iInfant;
//	int iCount;
	public Save1(String sFrom, String sTo, String sClass, Integer iAdult, Integer iChildren, Integer iInfant, String sBookingDate, Integer iPrice, String sTime)
	{
		this.sFrom=sFrom;
		this.sTo=sTo;
		this.sClass=sClass;
		this.iAdult=iAdult;
		this.iChildren=iChildren;
		this.iInfant=iInfant;
		this.sBookingDate=sBookingDate;
		this.iPrice=iPrice;
		this.sTime=sTime;
//		this.iCount = iCount;
	}
	public String toString()
	{
		return sFrom+" "+sTo+" "+sClass+" "+iAdult+" "+iChildren+" "+iInfant+" "+sBookingDate+" "+iPrice+" "+sTime;
	}
}
