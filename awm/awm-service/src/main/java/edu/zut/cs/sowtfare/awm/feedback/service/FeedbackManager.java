package edu.zut.cs.sowtfare.awm.feedback.service;

import edu.zut.cs.sowtfare.awm.feedback.domain.FeedBack;

import java.util.List;

public interface FeedbackManager {


    List<FeedBack> findByCustomer(String customerId);
}

