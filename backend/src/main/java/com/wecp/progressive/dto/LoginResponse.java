package com.wecp.progressive.dto;

public class LoginResponse {
   private String token;
   private String roles;
   private Integer userId;
<<<<<<< HEAD

   public LoginResponse(String token, String roles, Integer userId) {
      this.token = token;
      this.roles = roles;
      this.userId = userId;
   }

   public String getToken(){
      return token;
   }

   public void setToken(String token){
      this.token = token;
   }

   public String getRoles()
   {
      return roles;
   }

   public void setRole(String roles)
   {
      this.roles = roles;
   }

   public long getUserId()
   {
      return userId;
   }

   public void setUserId(Integer userId)
   {
      this.userId = userId;
   }

=======
>>>>>>> f8df9d574a9e90305800176f3d27753e146d0d04
}
