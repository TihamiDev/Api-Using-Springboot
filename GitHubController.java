       
	
	package com.GithubProfile.Controller;
        
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;
        
        import com.GithubProfile.Model.GitHubUser;
        import com.GithubProfile.Service.GitHubService;
        
        @RestController
        public class GitHubController {
        
            @Autowired
            private GitHubService gitHubService;
        
            @GetMapping("/api/github/user")
            public GitHubUser getGitHubUser(@RequestParam String username) {
                return gitHubService.getUserDetails(username);
            }
        }
