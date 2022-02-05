package com.lukeware.facade.entity.item;

import com.lukeware.facade.entity.product.IProduct;

/**
 * @author Diego Morais
 */
final record Item(IProduct product, double price) implements IItem {
}
