package edu.zut.cs.sowtfare.awm.customer.service;

import java.util.List;

import edu.zut.cs.sowtfare.awm.customer.domain.FeedBack;

public interface FeedbackManager {


    List<FeedBack> findByCustomer(String customerId);
}

