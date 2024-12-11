

    package com.GithubProfile.Service;
    
    import org.springframework.stereotype.Service;
    import org.springframework.web.client.RestTemplate;
    
    import com.GithubProfile.Model.GitHubUser;
    
    @Service
    public class GitHubService {
    
        private final RestTemplate restTemplate = new RestTemplate();
    
        public GitHubUser getUserDetails(String username) {
            String url = "https://api.github.com/users/" + username;
            return restTemplate.getForObject(url, GitHubUser.class);
        }
    }
