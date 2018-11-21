/*
 * Waltz - Enterprise Architecture
 * Copyright (C) 2016, 2017 Waltz open source project
 * See README.md for more information
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.khartec.waltz.service.complexity;

import com.khartec.waltz.data.complexity.ConnectionComplexityDao;
import com.khartec.waltz.model.complexity.ComplexityKind;
import com.khartec.waltz.model.complexity.ComplexityScore;
import org.jooq.Record1;
import org.jooq.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.khartec.waltz.model.complexity.ComplexityUtilities.tallyToComplexityScore;

@Service
public class ConnectionComplexityService {

    private final ConnectionComplexityDao connectionComplexityDao;


    @Autowired
    public ConnectionComplexityService(ConnectionComplexityDao connectionComplexityDao) {
        this.connectionComplexityDao = connectionComplexityDao;
    }


    /**
     * Find connection complexity of the given applications. The complexity
     * ratings are baselined against the application with the most
     * connections in the system.  If you wish specify a specific baseline use
     * the overloaded method.
     * @param idSelector
     * @return
     */
    public List<ComplexityScore> findByAppIdSelector(Select<Record1<Long>> idSelector) {
        int baseline = connectionComplexityDao.calculateBaseline();
        return findByAppIdSelector(idSelector, baseline);
    }



    public List<ComplexityScore> findByAppIdSelector(Select<Record1<Long>> idSelector, int baseline) {
        return connectionComplexityDao.findCounts(idSelector)
                .stream()
                .map(tally -> tallyToComplexityScore(ComplexityKind.CONNECTION, tally, baseline, Math::log))
                .collect(Collectors.toList());
    }

}