package pe.egcc.jsf.validadores.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Gustavo Coronel
 */
@ManagedBean
@RequestScoped
public class Demo04Controller implements Serializable {

  private static final long serialVersionUID = 4198571205223018058L;
  private int nota1;
  private int nota2;

  public int getNota1() {
    return nota1;
  }

  public void setNota1(int nota1) {
    this.nota1 = nota1;
  }

  public int getNota2() {
    return nota2;
  }

  public void setNota2(int nota2) {
    this.nota2 = nota2;
  }
}
