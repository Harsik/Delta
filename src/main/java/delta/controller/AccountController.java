// package delta.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// import delta.model.Account;
// import delta.service.AccountService;

// @RestController
// public class AccountController {
    
//     @Autowired
//     AccountService accountService;

//     @GetMapping("/create")
//     public Account create(){
//         Account account = new Account();
//         account.setName("user");
//         account.setPassword("password");
//         return accountService.save(account);
//     }
// }