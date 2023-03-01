/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.services;

import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkManager;
import com.codename1.ui.ComboBox;
import com.codename1.ui.Dialog;
import com.codename1.ui.TextField;
import com.codename1.ui.util.Resources;
import com.mycompany.utils.Statics;
import java.util.Map;
import java.util.Vector;

/**
 *
 * @author Rayen
 */
public class ServiceUtilisateur {
    
    //singleton 
    public static ServiceUtilisateur instance = null ;
    
    public static boolean resultOk = true;
    String json;

    //initilisation connection request 
    private ConnectionRequest req;
    
    
    public static ServiceUtilisateur getInstance() {
        if(instance == null )
            instance = new ServiceUtilisateur();
        return instance ;
    }
    
    
    
    public ServiceUtilisateur() {
        req = new ConnectionRequest();
        
    }
    
    
    public void signup(TextField email, ComboBox<String> roles,TextField password,TextField confirmPassword,TextField nom,TextField prenom, ComboBox<String> type,TextField adresse,TextField numtel , Resources res ) {
        

        
        String url = Statics.BASE_URL+"/registrationMobile?email="+email.getText().toString()+"&roles="+roles.getSelectedItem().toString()+
                "&password="+password.getText().toString()+"&nom="+nom.getText().toString()+
                "&prenom="+prenom.getText().toString()+"&type="+type.getSelectedItem().toString()
                +"&adresse="+adresse.getText().toString()+"&numtel="+numtel.getText().toString();
        
        req.setUrl(url);
       
        //Control saisi
        if(email.getText().equals(" ") && password.getText().equals(" ") && nom.getText().equals(" ")) {
            
            Dialog.show("Erreur","Veuillez remplir les champs","OK",null);
            
        }
        
        //hethi wa9t tsir execution ta3 url 
        req.addResponseListener((e)-> {
         
            //njib data ly7atithom fi form 
            byte[]data = (byte[]) e.getMetaData();//lazm awl 7aja n7athrhom ke meta data ya3ni na5o id ta3 kol textField 
            String responseData = new String(data);//ba3dika na5o content 
            
            System.out.println("data ===>"+responseData);
        }
        );
        
        
        //ba3d execution ta3 requete ely heya url nestanaw response ta3 server.
        NetworkManager.getInstance().addToQueueAndWait(req);
        
            
        
    }
    

}
