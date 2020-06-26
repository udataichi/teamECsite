package jp.co.internous.react.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import jp.co.internous.react.model.domain.dto.PurchaseHistoryDto;

@Mapper
public interface TblPurchaseHistoryMapper {
	int insert(Map<String, Object> parameter);
	
	/* userIdで履歴を検索  */
	List<PurchaseHistoryDto> findByUserId(@Param("userId") long userId);
	
	@Update("UPDATE tbl_purchase_history SET status = 0 WHERE user_id = #{userId}")
	long logicalDeleteByUserId(@Param("userId") long userId);
	
	
	
	
	
}
