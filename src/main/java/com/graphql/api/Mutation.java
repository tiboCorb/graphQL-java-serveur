package com.graphql.api;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

public class Mutation implements GraphQLRootResolver {
    private final IssueRepository issueRepository;

    public Mutation(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    public Issue createIssue(String id, String name, String type, String  date) {
        Issue newLink = new Issue(id,name,type,date);
        issueRepository.saveLink(newLink);
        return newLink;
    }
}
