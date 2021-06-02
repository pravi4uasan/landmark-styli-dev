package com.cm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.entity.Categories;
import com.cm.entity.Dress;
import com.cm.entity.Footwear;
import com.cm.entity.Shirts;
import com.cm.entity.TShirts;
import com.cm.repository.CategoryManagementRepo;
import com.cm.response.CategoryResponse;
import com.cm.response.MensVO;
import com.cm.response.WomensVO;

@Service
public class CategoryManagementServiceImpl  implements CategoryManagementService{


	@Autowired
	private CategoryManagementRepo categoryManagementRepo;

	@Override
	public void createCategory(Categories categories) {

		if(null!=categories) {
			categoryManagementRepo.save(categories);
		}


	}

	@Override
	public CategoryResponse getCategories() {
		Iterable<Categories> categories=categoryManagementRepo.findAll();
		CategoryResponse categoryResponse=new CategoryResponse();
		MensVO mnensVO=new MensVO();
		WomensVO womensVO =new WomensVO();
		List<Footwear> footwearList=new ArrayList<Footwear>();
		List<TShirts> tshirtsList=new ArrayList<TShirts>();
		List<Shirts> shirtsList=new ArrayList<Shirts>();
		List<Dress> dressList=new ArrayList<Dress>();
		List<TShirts> tshirtsListW=new ArrayList<TShirts>();
		if(null!=categories ) {
			for(Categories cate: categories) {


				Footwear footwear=new Footwear();
				footwear.setId(cate.getMens().getFootwear().getId());
				footwear.setBranded(cate.getMens().getFootwear().getBranded());
				footwear.setNonBranded(cate.getMens().getFootwear().getNonBranded());
				footwearList.add(footwear);

				TShirts tshirts=new TShirts();
				tshirts.setId(cate.getMens().getTshirts().getId());
				tshirts.setCausalTShirts(cate.getMens().getTshirts().getCausalTShirts());
				tshirts.setPlainTShirts(cate.getMens().getTshirts().getPlainTShirts());
				tshirts.setPrintedTshirts(cate.getMens().getTshirts().getPrintedTshirts());
				tshirtsList.add(tshirts);

				Shirts shirts=new Shirts();
				shirts.setId(cate.getMens().getShirts().getId());
				shirts.setCausalShirts(cate.getMens().getShirts().getCausalShirts());
				shirts.setPartyShirts(cate.getMens().getShirts().getPartyShirts());
				shirts.setPlainShirts(cate.getMens().getShirts().getPlainShirts());
				shirtsList.add(shirts);

				Dress dress=new Dress();
				dress.setId(cate.getWomens().getDress().getId());
				dress.setCasualDresses(cate.getWomens().getDress().getCasualDresses());
				dress.setPartyDresses(cate.getWomens().getDress().getPartyDresses());
				dressList.add(dress);

				TShirts tshirtsW=new TShirts();
				tshirtsW.setId(cate.getWomens().getTshirts().getId());
				tshirtsW.setCausalTShirts(cate.getWomens().getTshirts().getCausalTShirts());
				tshirtsW.setPlainTShirts(cate.getWomens().getTshirts().getPlainTShirts());
				tshirtsW.setPrintedTshirts(cate.getWomens().getTshirts().getPrintedTshirts());
				tshirtsListW.add(tshirts);



			}
			mnensVO.setFootwear(footwearList);
			mnensVO.setTShirts(tshirtsList);
			mnensVO.setShirts(shirtsList);

			womensVO.setDress(dressList);
			womensVO.setTShirts(tshirtsListW);

			categoryResponse.setMens(mnensVO);
			categoryResponse.setWomensVO(womensVO);
			System.out.println("categoryResponse >>"+categoryResponse.toString());
		}
		return categoryResponse;

	}

	@Override
	public void deleteCategory() {
		categoryManagementRepo.deleteAll();

	}

	@Override
	public void deleteById(int id) {

		categoryManagementRepo.deleteById(id);
	}

	@Override
	public Categories updateCategory(Categories categories, int id) {
		Optional<Categories> resp=categoryManagementRepo.findById(id);
		if(resp.isPresent()) {
			categories.setId(id);
			return categoryManagementRepo.save(categories);
		}
		return categories;


	}

}
