package com.graphql.api;

import java.util.ArrayList;
import java.util.List;

public class IssueRepository {
    private final List<Issue> issues;

    public IssueRepository() {
        issues = new ArrayList<>();
        //add some links to start off with
        issues.add(new Issue("1", "bdo Mobile","Atelier" ,"14/12/05"));
        issues.add(new Issue("2", "Faq sicave", "Livraison","12/10/90"));}
    public List<Issue> getAllLinks() {
return issues;
    }

    public void saveLink(Issue link) {
        issues.add(link);
    }
}
