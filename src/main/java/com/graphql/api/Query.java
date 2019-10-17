package com.graphql.api;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import java.util.List;

public class Query implements GraphQLRootResolver {
    private final IssueRepository issueRepository;

    public Query(IssueRepository linkRepository) {
        this.issueRepository = linkRepository;
    }

    public List<Issue> allIssues() {
        return issueRepository.getAllLinks();
    }
}
