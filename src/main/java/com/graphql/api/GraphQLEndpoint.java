package com.graphql.api;

import com.coxautodev.graphql.tools.SchemaParser;
import javax.servlet.annotation.WebServlet;

import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;

    @WebServlet(urlPatterns = "/graphql")
    public class GraphQLEndpoint extends SimpleGraphQLServlet {


        public GraphQLEndpoint() {
            super(buildSchema());
        }

        private static GraphQLSchema buildSchema() {
            IssueRepository linkRepository = new IssueRepository();
            return SchemaParser.newParser()
                    .file("schema.graphqls")
                    .resolvers(new Query(linkRepository))
                    .build()
                    .makeExecutableSchema();
        }
}
