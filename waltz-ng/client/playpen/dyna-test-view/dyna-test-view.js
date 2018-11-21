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

import _ from 'lodash';
import {initialiseData} from "../../common/index";
import {dynamicSections} from '../../dynamic-section/dynamic-section-definitions';
import template from './dyna-test-view.html';

const initialState = {
    parentEntityRef: {
        id: 645,
        kind: 'MEASURABLE'
    }
};

function controller($stateParams) {
    const vm = initialiseData(this, initialState);

    vm.$onInit = () => {
        console.log('init', $stateParams);

        vm.entityRef = {
            kind: $stateParams.kind,
            id: $stateParams.id
        };

        vm.section = _.find(dynamicSections, { id: $stateParams.sectionId });
    }
}


controller.$inject = [
    '$stateParams'
];


const view = {
    template,
    controller,
    controllerAs: 'ctrl'
};


export default view;