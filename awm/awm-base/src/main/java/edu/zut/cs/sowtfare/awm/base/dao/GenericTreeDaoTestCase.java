package edu.zut.cs.sowtfare.awm.base.dao;

import java.io.Serializable;

import edu.zut.cs.sowtfare.awm.base.domain.BaseTreeEntity;

public class GenericTreeDaoTestCase<PK extends Serializable, T extends BaseTreeEntity<T>, M extends GenericTreeDao<T, PK>>
		extends GenericDaoTestCase<PK, T, M> {

}
