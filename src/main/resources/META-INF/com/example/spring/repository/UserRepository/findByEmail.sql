SELECT                      
       id                   
     , username             
     , email                
     , password             
     , enabled              
     , locked               
     , credentials_expired  
     , account_expired      
  FROM users                
  WHERE email = /*email*/'email'