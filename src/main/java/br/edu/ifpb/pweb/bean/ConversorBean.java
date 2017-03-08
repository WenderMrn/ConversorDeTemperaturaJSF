package br.edu.ifpb.pweb.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name="conversorBean")
@ViewScoped
public class ConversorBean {
	private double intempc,intempf,outtempf,outtempc;

	public double getIntempc() {
		return intempc;
	}

	public void setIntempc(double intempc) {
		this.intempc = intempc;
	}

	public double getIntempf() {
		return intempf;
	}

	public void setIntempf(double intempf) {
		this.intempf = intempf;
	}

	public double getOuttempf() {
		return outtempf;
	}

	public void setOuttempf(double outtempf) {
		this.outtempf = outtempf;
	}

	public double getOuttempc() {
		return outtempc;
	}

	public void setOuttempc(double outtempc) {
		this.outtempc = outtempc;
	}
	
	public void converter(ActionEvent event){
		if(event.getComponent().getClientId().equals("form:btconvf")){
			this.outtempf = (this.intempc * 1.8) + 32;
		}else{
			this.outtempc = 5.0/9.0 * (this.intempf - 32);
		}
	}
}
