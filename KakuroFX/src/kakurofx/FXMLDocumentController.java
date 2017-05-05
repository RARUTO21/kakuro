/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kakurofx;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import java.util.ArrayList;
import javafx.scene.control.ComboBox;

/**
 *
 * @author Anthony
 */
public class FXMLDocumentController implements Initializable {
    
    private ArrayList< ArrayList<Integer> > llaves = new ArrayList();
    public int[][] logicalMatrix = new int[14][14];
    public Button[][] physicalMatrix = new Button[14][14];
    
    @FXML   //Declaracion de los botones
    public Button btn0000,btn0001,btn0002,btn0003,btn0004,btn0005,btn0006,btn0007,btn0008,btn0009,btn0010,btn0011,btn0012,btn0013;
    public Button btn0100,btn0101,btn0102,btn0103,btn0104,btn0105,btn0106,btn0107,btn0108,btn0109,btn0110,btn0111,btn0112,btn0113;
    public Button btn0200,btn0201,btn0202,btn0203,btn0204,btn0205,btn0206,btn0207,btn0208,btn0209,btn0210,btn0211,btn0212,btn0213;
    public Button btn0300,btn0301,btn0302,btn0303,btn0304,btn0305,btn0306,btn0307,btn0308,btn0309,btn0310,btn0311,btn0312,btn0313;
    public Button btn0400,btn0401,btn0402,btn0403,btn0404,btn0405,btn0406,btn0407,btn0408,btn0409,btn0410,btn0411,btn0412,btn0413;
    public Button btn0500,btn0501,btn0502,btn0503,btn0504,btn0505,btn0506,btn0507,btn0508,btn0509,btn0510,btn0511,btn0512,btn0513;
    public Button btn0600,btn0601,btn0602,btn0603,btn0604,btn0605,btn0606,btn0607,btn0608,btn0609,btn0610,btn0611,btn0612,btn0613;
    public Button btn0700,btn0701,btn0702,btn0703,btn0704,btn0705,btn0706,btn0707,btn0708,btn0709,btn0710,btn0711,btn0712,btn0713;
    public Button btn0800,btn0801,btn0802,btn0803,btn0804,btn0805,btn0806,btn0807,btn0808,btn0809,btn0810,btn0811,btn0812,btn0813;
    public Button btn0900,btn0901,btn0902,btn0903,btn0904,btn0905,btn0906,btn0907,btn0908,btn0909,btn0910,btn0911,btn0912,btn0913;
    public Button btn1000,btn1001,btn1002,btn1003,btn1004,btn1005,btn1006,btn1007,btn1008,btn1009,btn1010,btn1011,btn1012,btn1013;
    public Button btn1100,btn1101,btn1102,btn1103,btn1104,btn1105,btn1106,btn1107,btn1108,btn1109,btn1110,btn1111,btn1112,btn1113;
    public Button btn1200,btn1201,btn1202,btn1203,btn1204,btn1205,btn1206,btn1207,btn1208,btn1209,btn1210,btn1211,btn1212,btn1213;
    public Button btn1300,btn1301,btn1302,btn1303,btn1304,btn1305,btn1306,btn1307,btn1308,btn1309,btn1310,btn1311,btn1312,btn1313;
    public Button[][] matrizFisica;
    public Button crear_kakuro, cargar_kakuro, guardar_kakuro, resolver_kakuro;
    public ComboBox combo_crear, combo_resolver;
    
    
    public int[][] prueba = new int[100][4];
    
    public void enlazarBotones(){
        this.physicalMatrix[0][0] = this.btn0000; this.physicalMatrix[0][1] = this.btn0001; this.physicalMatrix[0][2] = this.btn0002; this.physicalMatrix[0][3] = this.btn0003; this.physicalMatrix[0][4] = this.btn0004; this.physicalMatrix[0][5] = this.btn0005; this.physicalMatrix[0][6] = this.btn0006; this.physicalMatrix[0][7] = this.btn0007; this.physicalMatrix[0][8] = this.btn0008; this.physicalMatrix[0][9] = this.btn0009; this.physicalMatrix[0][10] = this.btn0010; this.physicalMatrix[0][11] = this.btn0011; this.physicalMatrix[0][12] = this.btn0012; this.physicalMatrix[0][13] = this.btn0013;
        this.physicalMatrix[1][0] = this.btn0100; this.physicalMatrix[1][1] = this.btn0101; this.physicalMatrix[1][2] = this.btn0102; this.physicalMatrix[1][3] = this.btn0103; this.physicalMatrix[1][4] = this.btn0104; this.physicalMatrix[1][5] = this.btn0105; this.physicalMatrix[1][6] = this.btn0106; this.physicalMatrix[1][7] = this.btn0107; this.physicalMatrix[1][8] = this.btn0108; this.physicalMatrix[1][9] = this.btn0109; this.physicalMatrix[1][10] = this.btn0110; this.physicalMatrix[1][11] = this.btn0111; this.physicalMatrix[1][12] = this.btn0112; this.physicalMatrix[1][13] = this.btn0113;
        this.physicalMatrix[2][0] = this.btn0200; this.physicalMatrix[2][1] = this.btn0201; this.physicalMatrix[2][2] = this.btn0202; this.physicalMatrix[2][3] = this.btn0203; this.physicalMatrix[2][4] = this.btn0204; this.physicalMatrix[2][5] = this.btn0205; this.physicalMatrix[2][6] = this.btn0206; this.physicalMatrix[2][7] = this.btn0207; this.physicalMatrix[2][8] = this.btn0208; this.physicalMatrix[2][9] = this.btn0209; this.physicalMatrix[2][10] = this.btn0210; this.physicalMatrix[2][11] = this.btn0211; this.physicalMatrix[2][12] = this.btn0212; this.physicalMatrix[2][13] = this.btn0213;
        this.physicalMatrix[3][0] = this.btn0300; this.physicalMatrix[3][1] = this.btn0301; this.physicalMatrix[3][2] = this.btn0302; this.physicalMatrix[3][3] = this.btn0303; this.physicalMatrix[3][4] = this.btn0304; this.physicalMatrix[3][5] = this.btn0305; this.physicalMatrix[3][6] = this.btn0306; this.physicalMatrix[3][7] = this.btn0307; this.physicalMatrix[3][8] = this.btn0308; this.physicalMatrix[3][9] = this.btn0309; this.physicalMatrix[3][10] = this.btn0310; this.physicalMatrix[3][11] = this.btn0311; this.physicalMatrix[3][12] = this.btn0312; this.physicalMatrix[3][13] = this.btn0313;
        this.physicalMatrix[4][0] = this.btn0400; this.physicalMatrix[4][1] = this.btn0401; this.physicalMatrix[4][2] = this.btn0402; this.physicalMatrix[4][3] = this.btn0403; this.physicalMatrix[4][4] = this.btn0404; this.physicalMatrix[4][5] = this.btn0405; this.physicalMatrix[4][6] = this.btn0406; this.physicalMatrix[4][7] = this.btn0407; this.physicalMatrix[4][8] = this.btn0408; this.physicalMatrix[4][9] = this.btn0409; this.physicalMatrix[4][10] = this.btn0410; this.physicalMatrix[4][11] = this.btn0411; this.physicalMatrix[4][12] = this.btn0412; this.physicalMatrix[4][13] = this.btn0413;
        this.physicalMatrix[5][0] = this.btn0500; this.physicalMatrix[5][1] = this.btn0501; this.physicalMatrix[5][2] = this.btn0502; this.physicalMatrix[5][3] = this.btn0503; this.physicalMatrix[5][4] = this.btn0504; this.physicalMatrix[5][5] = this.btn0505; this.physicalMatrix[5][6] = this.btn0506; this.physicalMatrix[5][7] = this.btn0507; this.physicalMatrix[5][8] = this.btn0508; this.physicalMatrix[5][9] = this.btn0509; this.physicalMatrix[5][10] = this.btn0510; this.physicalMatrix[5][11] = this.btn0511; this.physicalMatrix[5][12] = this.btn0512; this.physicalMatrix[5][13] = this.btn0513;
        this.physicalMatrix[6][0] = this.btn0600; this.physicalMatrix[6][1] = this.btn0601; this.physicalMatrix[6][2] = this.btn0602; this.physicalMatrix[6][3] = this.btn0603; this.physicalMatrix[6][4] = this.btn0604; this.physicalMatrix[6][5] = this.btn0605; this.physicalMatrix[6][6] = this.btn0606; this.physicalMatrix[6][7] = this.btn0607; this.physicalMatrix[6][8] = this.btn0608; this.physicalMatrix[6][9] = this.btn0609; this.physicalMatrix[6][10] = this.btn0610; this.physicalMatrix[6][11] = this.btn0611; this.physicalMatrix[6][12] = this.btn0612; this.physicalMatrix[6][13] = this.btn0613;
        this.physicalMatrix[7][0] = this.btn0700; this.physicalMatrix[7][1] = this.btn0701; this.physicalMatrix[7][2] = this.btn0702; this.physicalMatrix[7][3] = this.btn0703; this.physicalMatrix[7][4] = this.btn0704; this.physicalMatrix[7][5] = this.btn0705; this.physicalMatrix[7][6] = this.btn0706; this.physicalMatrix[7][7] = this.btn0707; this.physicalMatrix[7][8] = this.btn0708; this.physicalMatrix[7][9] = this.btn0709; this.physicalMatrix[7][10] = this.btn0710; this.physicalMatrix[7][11] = this.btn0711; this.physicalMatrix[7][12] = this.btn0712; this.physicalMatrix[7][13] = this.btn0713;
        this.physicalMatrix[8][0] = this.btn0800; this.physicalMatrix[8][1] = this.btn0801; this.physicalMatrix[8][2] = this.btn0802; this.physicalMatrix[8][3] = this.btn0803; this.physicalMatrix[8][4] = this.btn0804; this.physicalMatrix[8][5] = this.btn0805; this.physicalMatrix[8][6] = this.btn0806; this.physicalMatrix[8][7] = this.btn0807; this.physicalMatrix[8][8] = this.btn0808; this.physicalMatrix[8][9] = this.btn0809; this.physicalMatrix[8][10] = this.btn0810; this.physicalMatrix[8][11] = this.btn0811; this.physicalMatrix[8][12] = this.btn0812; this.physicalMatrix[8][13] = this.btn0813;
        this.physicalMatrix[9][0] = this.btn0900; this.physicalMatrix[9][1] = this.btn0901; this.physicalMatrix[9][2] = this.btn0902; this.physicalMatrix[9][3] = this.btn0903; this.physicalMatrix[9][4] = this.btn0904; this.physicalMatrix[9][5] = this.btn0905; this.physicalMatrix[9][6] = this.btn0906; this.physicalMatrix[9][7] = this.btn0907; this.physicalMatrix[9][8] = this.btn0908; this.physicalMatrix[9][9] = this.btn0909; this.physicalMatrix[9][10] = this.btn0910; this.physicalMatrix[9][11] = this.btn0911; this.physicalMatrix[9][12] = this.btn0912; this.physicalMatrix[9][13] = this.btn0913;
        this.physicalMatrix[10][0] = this.btn1000; this.physicalMatrix[10][1] = this.btn1001; this.physicalMatrix[10][2] = this.btn1002; this.physicalMatrix[10][3] = this.btn1003; this.physicalMatrix[10][4] = this.btn1004; this.physicalMatrix[10][5] = this.btn1005; this.physicalMatrix[10][6] = this.btn1006; this.physicalMatrix[10][7] = this.btn1007; this.physicalMatrix[10][8] = this.btn1008; this.physicalMatrix[10][9] = this.btn1009; this.physicalMatrix[10][10] = this.btn1010; this.physicalMatrix[10][11] = this.btn1011; this.physicalMatrix[10][12] = this.btn1012; this.physicalMatrix[10][13] = this.btn1013;
        this.physicalMatrix[11][0] = this.btn1100; this.physicalMatrix[11][1] = this.btn1101; this.physicalMatrix[11][2] = this.btn1102; this.physicalMatrix[11][3] = this.btn1103; this.physicalMatrix[11][4] = this.btn1104; this.physicalMatrix[11][5] = this.btn1105; this.physicalMatrix[11][6] = this.btn1106; this.physicalMatrix[11][7] = this.btn1107; this.physicalMatrix[11][8] = this.btn1108; this.physicalMatrix[11][9] = this.btn1109; this.physicalMatrix[11][10] = this.btn1110; this.physicalMatrix[11][11] = this.btn1111; this.physicalMatrix[11][12] = this.btn1112; this.physicalMatrix[11][13] = this.btn1113;
        this.physicalMatrix[12][0] = this.btn1200; this.physicalMatrix[12][1] = this.btn1201; this.physicalMatrix[12][2] = this.btn1202; this.physicalMatrix[12][3] = this.btn1203; this.physicalMatrix[12][4] = this.btn1204; this.physicalMatrix[12][5] = this.btn1205; this.physicalMatrix[12][6] = this.btn1206; this.physicalMatrix[12][7] = this.btn1207; this.physicalMatrix[12][8] = this.btn1208; this.physicalMatrix[12][9] = this.btn1209; this.physicalMatrix[12][10] = this.btn1210; this.physicalMatrix[12][11] = this.btn1211; this.physicalMatrix[12][12] = this.btn1212; this.physicalMatrix[12][13] = this.btn1213;
        this.physicalMatrix[13][0] = this.btn1300; this.physicalMatrix[13][1] = this.btn1301; this.physicalMatrix[13][2] = this.btn1302; this.physicalMatrix[13][3] = this.btn1303; this.physicalMatrix[13][4] = this.btn1304; this.physicalMatrix[13][5] = this.btn1305; this.physicalMatrix[13][6] = this.btn1306; this.physicalMatrix[13][7] = this.btn1307; this.physicalMatrix[13][8] = this.btn1308; this.physicalMatrix[13][9] = this.btn1309; this.physicalMatrix[13][10] = this.btn1310; this.physicalMatrix[13][11] = this.btn1311; this.physicalMatrix[13][12] = this.btn1312; this.physicalMatrix[13][13] = this.btn1313;
    }
    
    //@FXML
    public void escribir(){
        for (int i = 0; i< 14; i++) {
            for(int j = 0; j< 14; j++){
                physicalMatrix[i][j].setText(String.valueOf(i)+"\n"+String.valueOf(j));
            }
        }
        
    }
    
    
    public void mostrarLlaves(){// → ↓
        int x,y;
        String valorH,valorV,texto_final;
        
        for(ArrayList<Integer> llave: llaves){
            x = llave.get(0);
            y = llave.get(1);
            if(llave.get(3)!= 0){
                if(llave.get(3)== -1)
                    valorH = "?→";
                else{
                    valorH = String.valueOf(llave.get(3))+"→";
                }
            }else{
                valorH = "";
            }
            if(llave.get(2)!= 0){
                if(llave.get(2)== -1)
                    valorV = "?↓";
                else{
                    valorV = String.valueOf(llave.get(2))+"↓";
                }
            }else{
                valorV = "";
            }
            //valorH = (llave.get(3)!= 0) ? String.valueOf(llave.get(3))+"→" : "";
            //valorV = (llave.get(2)!= 0) ? String.valueOf(llave.get(2))+"↓" : "";
            texto_final = valorH + "\n"+valorV;
            if(llave.get(3) == 0 || llave.get(2) == 0)
                texto_final = texto_final.replace("\n","");
            physicalMatrix[x][y].setText(texto_final);
            physicalMatrix[x][y].setStyle("-fx-opacity:1; -fx-base: #000000; -fx-text-fill: white");
        }
    }
    
    public void cargarLlaves(){
        this.empaquetarValores(new Integer[][]{  {0,1,15,0},{0,2,8,0},{0,3,29,0},{0,5,21,0},{0,11,-1,0},{0,12,14,0},
                                            {0,12,14,0},{1,0,0,13},{1,4,15,-1},{1,6,11,0},{1,7,-1,0},{1,10,-1,7},
                                            {2,0,0,32},{2,9,14,-1},{2,11,0,-1},{2,13,17,0},{3,1,9,0},{3,2,5,27},
                                            {3,7,31,0},{3,8,19,-1},{3,10,13,0},{3,12,0,-1},{4,0,0,7},{4,4,14,0},
                                            {4,6,0,24},{4,12,0,-1},{5,0,0,17},{5,5,-1,0},{5,6,0,13},{5,9,0,-1},
                                            {5,12,0,-1},{6,1,14,0},{6,2,0,23},{6,6,0,13},{6,11,-1,0},{6,13,29,0},
                                            {7,0,0,-1},{7,2,3,12},{7,5,-1,0},{7,6,4,11},{7,10,-1,-1},{7,12,-1,-1},
                                            {8,0,0,3},{8,3,9,0},{8,4,0,14},{8,9,0,-1},{8,11,24,15},{9,0,0,16},
                                            {9,5,0,-1},{9,8,21,0},{9,10,0,-1},{9,12,-1,-1},{10,2,0,-1},{10,4,-1,0},
                                            {10,6,17,0},{10,7,0,-1},{10,10,5,16},{11,3,-1,-1},{11,5,0,-1},{11,7,0,-1},
                                            {11,9,14,11},{11,13,14,0},{12,2,-1,-1},{12,4,-1,0},{12,5,-1,-1},{12,7,0,23},
                                            {12,12,-1,-1},{13,1,0,-1},{13,3,0,10},{13,8,0,-1},{13,11,0,15}                  });  
    } 
    
    
    public void cargarMatrizLogica(){
        
        cargarMatrizLogicaAux(new Integer[][]{
                {0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 }, 
                {0 , 1 , 1 , 1 , 0 , 1 , 0 , 0 , 0 , 0 , 0 , 1 , 1 , 0 }, 
                {0 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 0 , 0 , 1 , 0 , 1 , 0 }, 
                {0 , 0 , 0 , 1 , 1 , 1 , 1 , 0 , 0 , 1 , 0 , 0 , 0 , 1 }, 
                {0 , 1 , 1 , 1 , 0 , 0 , 0 , 1 , 1 , 1 , 1 , 0 , 0 , 1 }, 
                {0 , 1 , 1 , 1 , 1 , 0 , 0 , 1 , 1 , 0 , 1 , 0 , 0 , 1 }, 
                {0 , 0 , 0 , 1 , 1 , 1 , 0 , 1 , 1 , 0 , 0 , 0 , 0 , 0 }, 
                {0 , 1 , 0 , 1 , 1 , 0 , 0 , 1 , 1 , 0 , 0 , 1 , 0 , 1 }, 
                {0 , 1 , 1 , 0 , 0 , 1 , 1 , 1 , 0 , 0 , 1 , 0 , 1 , 1 }, 
                {0 , 1 , 1 , 1 , 0 , 0 , 1 , 0 , 0 , 0 , 0 , 1 , 0 , 1 }, 
                {0 , 0 , 0 , 1 , 0 , 0 , 0 , 0 , 1 , 0 , 0 , 1 , 1 , 1 }, 
                {0 , 0 , 0 , 0 , 1 , 0 , 1 , 0 , 1 , 0 , 1 , 1 , 0 , 0 }, 
                {0 , 0 , 0 , 1 , 0 , 0 , 1 , 0 , 1 , 1 , 1 , 1 , 0 , 1 }, 
                {0 , 0 , 1 , 0 , 1 , 1 , 0 , 0 , 0 , 1 , 0 , 0 , 1 , 1 } 
    
                                                                });
    }
  
    public void cargarMatrizLogicaAux(Integer[][] valores){
        for(int i = 0; i <14; i++)
            for(int j = 0; j<14; j++){
                logicalMatrix[i][j] = valores[i][j];
                if(logicalMatrix[i][j] == 0) { 
                    physicalMatrix[i][j].setStyle("-fx-opacity:1; -fx-base: #000000; -fx-text-fill: white");
                }
            
            }
    }
    
    
    
    public void empaquetarValores(Integer[][] valores){
        ArrayList<Integer> temp = new ArrayList();
        for(Integer[] ele: valores){
            //System.out.println("Llave: [" + ele[0].toString() + ","+ele[1].toString()+","+ele[2].toString()+","+ele[3].toString()+"]");
            temp.clear();
            llaves.add(empaquetarValoresAux(ele));//temp);
        }
    }
    
    public ArrayList<Integer> empaquetarValoresAux(Integer[] valores){
        ArrayList<Integer> temp = new ArrayList();
        for(Integer ele: valores)
            temp.add(ele);
        return temp;
    }
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        this.enlazarBotones();
        //this.escribir();
        //this.cargarMatrizLogica();
        //this.cargarLlaves();
        this.mostrarLlaves();
        
    } 
    
    
    
}



/*@FXML
    private void leerTextoBoton(ActionEvent event){
        //llaves = button1.getText().split("\n");
        
        llaves[0] = btn0000.getText().split("\n")[0];
        llaves[1] = btn0000.getText().split("\n")[1];
        
        System.out.println("Valor de llaves: ["+llaves[0]+","+llaves[1]+"]");
    }*/